package dummy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import demowebshop.baseclass.BaseClass;

public class Demo extends BaseClass {

	@Test
		public void addtocart() throws InterruptedException {
			WebElement products = driver.findElement(By.xpath("//strong[text()='Featured products']"));
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
			Reporter.log("added to cart",true);
		}

}
