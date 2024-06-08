package demowebshop.baseclass;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ISuite;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import demowebshop.fileutility.ReadProperty;
import demowebshop.genericutility.WebDriverUtility;
import demowebshop.objectrepository.LoginPage;
import demowebshop.objectrepository.WelcomePage;


public class BaseClass {
	public  static WebDriver driver;

	@BeforeClass(alwaysRun = true)
	public void openBrowser() throws Throwable
	{
		ReadProperty read=new ReadProperty();
		String url=read.fetchProperty("url");
		System.out.println(url);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Reporter.log("Browser Opened successfully",true);
	}

	@AfterClass(alwaysRun = true)
	public void closeBrowser()
	{
		driver.quit();
		Reporter.log("Browser closed successfully",true);
	}

	@BeforeMethod(alwaysRun = true)
	public void login() throws Throwable
	{ 
		WelcomePage wp=new WelcomePage(driver);
		WebDriverUtility wbu=new WebDriverUtility();
		wbu.toClickOnWebElement(wp.getLoginbutton());
		//WebElement Forgetpassword=driver.findElement(By.xpath("//a[text()='Forgot password?']"));
		//Assert.assertTrue(Forgetpassword.isDisplayed());
		//Reporter.log("login page is displayed",true);
		ReadProperty read=new ReadProperty();
		String username=read.fetchProperty("username");
		String password=read.fetchProperty("password");
		LoginPage lp=new LoginPage(driver);
		wbu.sendText(lp.getEmailIdTextField(),username);
		wbu.sendText(lp.getPasswordTextField(),password);
		wbu.toClickOnWebElement(lp.getLoginbutton());
	
	/*
		 wp.getLoginbutton().click();
		 String username=read.fetchProperty("username");
		 String password=read.fetchProperty("password");
		 LoginPage lp=new LoginPage(driver);
		 lp.getEmailIdTextField().sendKeys(username);
	     lp.getPasswordTextField().sendKeys(password);
	     lp.getLoginbutton().click();
	*/
		Reporter.log("logged in successfully",true);
	}

	@AfterMethod(alwaysRun = true)
	public void logout()
	{
		driver.findElement(By.xpath("//a[text()='Log out']"));
		Reporter.log("logged out successfull",true);
	}

	public void onStart(ISuite suite) {
		// TODO Auto-generated method stub
		
	}
}



