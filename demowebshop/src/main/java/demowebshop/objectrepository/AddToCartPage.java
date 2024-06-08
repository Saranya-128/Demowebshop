package demowebshop.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class AddToCartPage extends BasePage {

	public AddToCartPage(WebDriver driver) {
		super(driver);
	}
	
	
    @FindBy(xpath = "//div[@class='product-grid home-page-product-grid']/div[3]/descendant::a[2]")
    private WebElement selectProduct;

	public WebElement getSelectProduct() {
		return selectProduct;
	}
    @FindAll({@FindBy(id = "add-to-cart-button-31"),@FindBy(xpath = "//input[@class='button-1 add-to-cart-button']")})
    private WebElement addToCartButton;

	public WebElement getAddToCartButton() {
		return addToCartButton;
	}
   
    
    }

