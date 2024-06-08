package demowebshop.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}
	// product 
		@FindAll({ @FindBy(xpath = "//div[@class='product-grid home-page-product-grid']/div[3]/div/div[2]/h2/a"),
				@FindBy(xpath = "//a[@href='/141-inch-laptop' and text()='14.1-inch Laptop']") })
		private WebElement computer;

		public WebElement getComputer() {
			return computer;
		}
  //myprofile

	@FindAll({@FindBy(partialLinkText = "saran312b@gmail.com"),@FindBy(xpath = "//a[@href='/customer/info' and text()='saran312b@gmail.com' ]")})
	private WebElement myprofile;

	public WebElement getMyprofile() {
		return myprofile;
	}
	
	
		
	
}


