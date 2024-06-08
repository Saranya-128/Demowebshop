package demowebshop.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{

	public MyAccountPage(WebDriver driver) {
		super(driver);
		}
	
	  //to click getAddress
		@FindAll({@FindBy(xpath = "//a[@class='inactive' and text()='Addresses']"),@FindBy(xpath = "//a[@class='inactive' and @href='/customer/addresses']")})
		private WebElement getAddress;

		public WebElement getAddress() {
			return getAddress;
		}
		// to click addnew
		@FindAll({@FindBy(css = "[value='Add new']"),@FindBy(xpath = "//input[@type='button' and @class='button-1 cart-button']")})
		private WebElement addnew;
		
		public WebElement getAddnew() {
			return addnew;
		}
		
		//add firstname address
		@FindAll({@FindBy(id = "Address_FirstName"),@FindBy(name = "Address.FirstName")})
		private WebElement firstname;
		public WebElement getFirstname() {
			return firstname;
		}
		//add lastname address
		@FindAll({@FindBy(id = "Address_LastName"),@FindBy(name = "Address.LastName")})
		private WebElement lastname;
		public WebElement getLastname() {
			return lastname;
		}
		// add emailtextfield
		@FindAll({@FindBy(id = "Address_Email"),@FindBy(name = "Address.Email")})
		private WebElement emailid;
		public WebElement getEmailid() {
			return emailid;
		}
		// addcompany
		@FindAll({@FindBy(id = "Address_Company"),@FindBy(name = "Address.Company")})
		private WebElement company;
		public WebElement getCompany() {
			return company;
		}
		// country
		@FindAll({@FindBy(id = "Address_CountryId"),@FindBy(name = "Address.CountryId")})
		private WebElement country;
		
		public WebElement getCountry() {
			return country;
		}
		//city
		@FindAll({@FindBy(id = "Address_City"),@FindBy(name = "Address.City")})
		private WebElement city;
		
		public WebElement getCity() {
			
			return city;
		}
		//address1
		@FindAll({@FindBy(id = "Address_Address1"),@FindBy(name = "Address.Address1")})
		private WebElement address1;
		
		public WebElement getAddress1() {
			return address1;
		}
		//address2
		@FindAll({@FindBy(id = "Address_Address2"),@FindBy(name = "Address.Address2")})
		private WebElement address2;
		
		public WebElement getAddress2() {
			return address2;
		}
		//postal
		@FindAll({@FindBy(id = "Address_ZipPostalCode"),@FindBy(name = "Address.ZipPostalCode")})
		private WebElement Zippostal;
		public WebElement getZippostal() {
			return Zippostal;
		}
		//to add phonenumber
		@FindAll({@FindBy(id = "Address_PhoneNumber"),@FindBy(name = "Address.PhoneNumber")})
		private WebElement getPhoneNumber;

		public WebElement getGetPhoneNumber() {
			return getPhoneNumber;
		}
		//to click faxnumber
		@FindAll({@FindBy(id = "Address_FaxNumber"),@FindBy(name = "Address.FaxNumber")})
		private WebElement faxnumber;
		public WebElement getFaxnumber() {
			return faxnumber;
		}
		//to click save
		@FindAll({@FindBy(xpath = "//input[@class='button-1 save-address-button']"),@FindBy(css = "[value='Save']")})
		private WebElement save;
		public WebElement getSave() {
			return save;
		}
		
		

		
	}
