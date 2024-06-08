package demowebshop.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class ProductDetails extends BasePage{

	public ProductDetails(WebDriver driver) {
		super(driver);
	}
	@FindAll({@FindBy(id = "add-to-cart-button-31"),@FindBy(xpath = "//input[@class='button-1 add-to-cart-button']")})
    private WebElement addtocart;
	
	public WebElement getAddtocart() {
		return addtocart;
	}

}



