package demowebshop.functionalascripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import demowebshop.fileutility.ReadExcel;
import demowebshop.fileutility.ReadProperty;

public class LoginFunctionalTest {

	@DataProvider
		public Object[][] dataSupplier()
		{
			ReadExcel readExcel=new ReadExcel();
			Object[][] data=readExcel.getMultipleData("Sheet1");
			return data;
		}
		
		@Test(dataProvider = "dataSupplier")
		public void loginTest(String username,String password) throws InterruptedException
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			ReadProperty read=new ReadProperty();
			String url=read.fetchProperty("url");
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.partialLinkText("Log in")).click();
			driver.findElement(By.id("Email")).sendKeys(username);
			driver.findElement(By.id("Password")).sendKeys(password);
			Thread.sleep(2000);
			driver.close(); 
		}

}
