package demoshop.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import demowebshop.baseclass.BaseClass;
import demowebshop.genericutility.WebDriverUtility;
import demowebshop.objectrepository.AddToCartPage;
import demowebshop.objectrepository.BasePage;
import demowebshop.objectrepository.HomePage;
import demowebshop.objectrepository.ProductDetails;

@Listeners(demowebshop.listnerimplementation.ListnerClass.class)
public class AddToCart extends BaseClass{
	
	@Test(retryAnalyzer = demowebshop.listnerimplementation.RetryListner.class)
	public void addToCartTest()
	{
		WebDriverUtility webDriverUtility=new WebDriverUtility();
		HomePage homePage=new HomePage(driver);
		webDriverUtility.toClickOnWebElement(homePage.getComputer());
		ProductDetails productDetails=new ProductDetails(driver);
		webDriverUtility.toClickOnWebElement(productDetails.getAddtocart());
	
		
		
		/*WebElement products = driver.findElement(By.xpath("//strong[text()='Featured products']"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true);", products);
	Thread.sleep(3000);
	//driver.findElement(By.xpath("//a[text()='Simple Computer']")).click();
	//driver.findElement(By.id("product_attribute_75_5_31_96")).click();
	//driver.findElement(By.id("add-to-cart-button-75")).click();
	driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']/div[3]/descendant::a[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("add-to-cart-button-31")).click();
	driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
	Reporter.log("added to cart",true);*/

	}
}