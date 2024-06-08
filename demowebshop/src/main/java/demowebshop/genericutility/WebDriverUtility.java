package demowebshop.genericutility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtility {

	// To get the title
	public String toGetTitle(WebDriver driver) {
		return driver.getTitle();

	}

	// To get the url
	public String toGetUrl(WebDriver driver) {
		return driver.getCurrentUrl();
	}

	// To Click On WebElement
	public void toClickOnWebElement(WebElement element) {
		element.click();
	}

	// To Send The Text
	public void sendText(WebElement element, String text) {
		element.sendKeys(text);
	}

	// To Accept Alert
	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}

	// To dismiss Alert
	public void dismissAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}

	// To get the text from Alert
	public String getTextFromAlert(WebDriver driver) {
		return driver.switchTo().alert().getText();
	}
	// To send text to Alert

	public void sendTextToAlert(WebDriver driver, String text) {
		driver.switchTo().alert().sendKeys(text);
	}

	// To find what kind of dropDown
	public boolean isMultipleMethod(WebElement dropDown) {
		Select sel = new Select(dropDown);
		return sel.isMultiple();
	}
	// To Select The DropDown by index

	public void toSelectDropDownByIndex(WebElement dropDown, int index) {
		Select sel = new Select(dropDown);
		sel.selectByIndex(index);
	}
	// To Select The DropDown by visibletext

	public void toSelectDropDownByVisibleText(WebElement dropDown, String text) {
		Select sel = new Select(dropDown);
		sel.selectByVisibleText(text);
	}

	// To Select The DropDown by value

	public void toSelectDropDownByValue(WebElement dropDown, String value) {
		Select sel = new Select(dropDown);
		sel.selectByValue(value);
	}

	// To Deselect the dropdown by index

	public void todeSelectDropDownByIndex(WebElement dropDown, int index) {
		Select sel = new Select(dropDown);
		sel.deselectByIndex(index);
	}
	// To DeSelect The DropDown by visibletext

	public void toDeSelectDropDownByVisibleText(WebElement dropDown, String text) {
		Select sel = new Select(dropDown);
		sel.deselectByVisibleText(text);
	}

	// To DeSelect The DropDown by value

	public void toDeSelectDropDownByValue(WebElement dropDown, String text) {
		Select sel = new Select(dropDown);
		sel.deselectByValue(text);

	}

	// To move to the element
	public void toMoveToTheElement(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}

	// To click the web element
	public void toClick(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.click(element).perform();
	}

	// To perform the right click action
	public void toContextClick(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.contextClick(element).perform();
	}

	// To perform the scroll to action
	public void toScrollToTheElement(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.scrollToElement(element).perform();
	}

	// To perform the double click actions
	public void toDoubleClick(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.doubleClick(element).perform();
	}

	// To perform the drag and drop actions
	public void toDragAndDrop(WebDriver driver, WebElement element, WebElement element2) {
		Actions act = new Actions(driver);
		act.dragAndDrop(element, element2).perform();
	}

	// To perform the click and hold actions
	public void toClickAndHold(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.clickAndHold(element).perform();
	}

	// To perform the release action
	public void toRelease(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.release(element).perform();
	}

	// To handle the frame by index
	public void frameByIndex(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}

	// To handle the frame by id and name attribute
	public void frameByIdOrName(WebDriver driver, String text) {
		driver.switchTo().frame(text);
	}

	// To handle the frame by web element
	public void frameByWebelement(WebDriver driver, WebElement element) {
		driver.switchTo().frame(element);
	}

	// To switch the driver focus to parent frame
	public void toParentFrame(WebDriver driver) {
		driver.switchTo().parentFrame();
	}

	// To switch the driver focus to main frame
	public void toDefaultContent(WebDriver driver) {
		driver.switchTo().defaultContent();
	}

	// to capture a scrrenshot
	public void toTakeScrrenshot(WebDriver driver, String screenshotName) {
		TakesScreenshot ts = (TakesScreenshot) driver;

		File ss = ts.getScreenshotAs(OutputType.FILE);
		File path = new File("./Screenshots/" + screenshotName + ".png");

		try {
			FileHandler.copy(ss, path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// to capture a screenshot of webelement

	public void toTakeScreenshotWebElement(WebElement element, String screenshotName) {
		File img = element.getScreenshotAs(OutputType.FILE);
		File path = new File("./Screenshots/\"+screenshotName+\".png");
		try {
			FileHandler.copy(img, path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
