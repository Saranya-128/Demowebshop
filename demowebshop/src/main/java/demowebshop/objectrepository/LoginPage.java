package demowebshop.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}
@FindAll({@FindBy(id = "Email"),@FindBy(name = "Email")})
private WebElement emailIdTextField;
public WebElement getEmailIdTextField() {
	return emailIdTextField;
}
@FindAll({@FindBy(id = "Password"),@FindBy(name = "Password")})
private WebElement passwordTextField;
public WebElement getPasswordTextField() {
	return passwordTextField;
}
@FindAll({@FindBy(css = "input[class='button-1 login-button']"),@FindBy(xpath ="//input[@value='Log in']")})
private WebElement loginbutton;
public WebElement getLoginbutton() {
	return loginbutton;
}

}
