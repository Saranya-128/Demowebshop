package demowebshop.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class WelcomePage extends BasePage {

	public WelcomePage(WebDriver driver) {
		super(driver);
	}

//to login
	@FindAll({ @FindBy(partialLinkText = "Log in"), @FindBy(className = "ico-login") })
	private WebElement loginbutton;

	public WebElement getLoginbutton() {
		return loginbutton;
	}


//logout
	@FindAll({ @FindBy(partialLinkText = "Log ou"), @FindBy(className = "ico-logout") })
	private WebElement logout;

	public WebElement getLogout() {
		return logout;
	}

}
