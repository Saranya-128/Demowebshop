package demoshop.scripts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import demowebshop.baseclass.BaseClass;
import demowebshop.genericutility.WebDriverUtility;
import demowebshop.objectrepository.AddToCartPage;
import demowebshop.objectrepository.HomePage;
import demowebshop.objectrepository.MyAccountPage;
@Listeners(demowebshop.listnerimplementation.ListnerClass.class)
public class AddAddress extends BaseClass {
	@Test//(retryAnalyzer = demowebshop.listnerimplementation.RetryListner.class)
	public void addAddress()
	{
		WebDriverUtility webDriverUtility=new WebDriverUtility();
		HomePage homepage=new HomePage(driver);
		MyAccountPage myAccountPage=new MyAccountPage(driver);
		webDriverUtility.toMoveToTheElement(driver,homepage.getMyprofile());
		webDriverUtility.toClick(driver,homepage.getMyprofile());
		webDriverUtility.toMoveToTheElement(driver, myAccountPage.getAddress());
		webDriverUtility.toClick(driver, myAccountPage.getAddress());
		webDriverUtility.toClickOnWebElement(myAccountPage.getAddnew());
		webDriverUtility.toMoveToTheElement(driver, myAccountPage.getFirstname());
		webDriverUtility.sendText(myAccountPage.getFirstname(), "Saranya");
		webDriverUtility.toMoveToTheElement(driver, myAccountPage.getLastname());
		webDriverUtility.sendText(myAccountPage.getLastname(), "bala");
		webDriverUtility.toMoveToTheElement(driver, myAccountPage.getEmailid());
		webDriverUtility.sendText(myAccountPage.getEmailid(), "saran312b@gmail.com");
		webDriverUtility.toMoveToTheElement(driver, myAccountPage.getCompany());
		webDriverUtility.sendText(myAccountPage.getCompany(), "demo");
		webDriverUtility.toMoveToTheElement(driver, myAccountPage.getCountry());
		webDriverUtility.toClickOnWebElement(myAccountPage.getCountry());
		webDriverUtility.toSelectDropDownByVisibleText(myAccountPage.getCountry(), "India");
		webDriverUtility.toMoveToTheElement(driver, myAccountPage.getCity());
		webDriverUtility.sendText(myAccountPage.getCity(), "chennai");
		webDriverUtility.toMoveToTheElement(driver, myAccountPage.getAddress1());
		webDriverUtility.sendText(myAccountPage.getAddress1(), "senthilnagar");
		webDriverUtility.toMoveToTheElement(driver, myAccountPage.getAddress2());
		webDriverUtility.sendText(myAccountPage.getAddress2(), "thoraipakkam");
		webDriverUtility.toMoveToTheElement(driver, myAccountPage.getZippostal());
		webDriverUtility.sendText(myAccountPage.getZippostal(), "600096");
		webDriverUtility.toMoveToTheElement(driver, myAccountPage.getGetPhoneNumber());
		webDriverUtility.sendText(myAccountPage.getGetPhoneNumber(), "9751660984");
		webDriverUtility.toMoveToTheElement(driver, myAccountPage.getFaxnumber());
		webDriverUtility.sendText(myAccountPage.getFaxnumber(), "12345677");
		webDriverUtility.toMoveToTheElement(driver, myAccountPage.getSave());
		webDriverUtility.toClickOnWebElement(myAccountPage.getSave());
		
		
		
		/*MyAccountPage myAccountpage=new MyAccountPage(driver);
		WebDriverUtility webDriverUtility=new WebDriverUtility();
		HomePage homePage=new HomePage(driver);
		webDriverUtility.toMoveToElement(driver, homePage.getLink());
		webDriverUtility.toClick(driver, homePage.getLink());
		Myaccountpage myacc=new Myaccountpage(driver);
		webDriverUtility.toMoveToElement(driver, myacc.getAddress());
		webDriverUtility.toClick(myacc.getAddress());
		webDriverUtility.toMoveToElement(driver, myacc.getAddnew());
		webDriverUtility.toClick(myacc.getAddnew());
		//add new address
		webDriverUtility.toMoveToElement(driver, myacc.getFirstname());
		webDriverUtility.toSendTheText(myacc.getFirstname(), "Shalini");
		webDriverUtility.toMoveToElement(driver, myacc.getLastname());
		webDriverUtility.toSendTheText(myacc.getLastname(), "rajappa");
		webDriverUtility.toMoveToElement(driver, myacc.getEmailid());
		webDriverUtility.toSendTheText(myacc.getEmailid(), "shalinirajappa1798@gmail.com");
		webDriverUtility.toMoveToElement(driver, myacc.getCompany());
		webDriverUtility.toSendTheText(myacc.getCompany(), "demo");
		webDriverUtility.toMoveToElement(driver, myacc.getCountry());
		webDriverUtility.toClick(myacc.getCountry());
		webDriverUtility.selectByVisibleText(myacc.getCountry(), "India");
		webDriverUtility.toMoveToElement(driver, myacc.getCity());
		webDriverUtility.toSendTheText(myacc.getCity(), "chennai");
		webDriverUtility.toMoveToElement(driver, myacc.getAddress1());
		webDriverUtility.toSendTheText(myacc.getAddress1(), "xxxx");
		webDriverUtility.toMoveToElement(driver, myacc.getAddress2());
		webDriverUtility.toSendTheText(myacc.getAddress2(), "yyyy");
		webDriverUtility.toMoveToElement(driver, myacc.getZippostal());
		webDriverUtility.toSendTheText(myacc.getZippostal(), "600042");
		webDriverUtility.toMoveToElement(driver, myacc.getPhonenumber());
		webDriverUtility.toSendTheText(myacc.getPhonenumber(), "9442711262");
		webDriverUtility.toMoveToElement(driver, myacc.getFaxnumber());
		webDriverUtility.toSendTheText(myacc.getFaxnumber(), "12345677");
		webDriverUtility.toMoveToElement(driver, myacc.getSave());
		webDriverUtility.toClick(myacc.getSave());*/
		
	}
}

