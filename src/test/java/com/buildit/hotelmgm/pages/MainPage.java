package com.buildit.hotelmgm.pages;
/**
 * @author Harshal Mistry
 *
 */
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.jcabi.aspects.Loggable;


public class MainPage extends PageObject {

	public MainPage(final WebDriver driver){
		super(driver);
	}
	
	final static String HOTEL_MGMT_URL = "http://192.168.99.100:3003/";
	
	@DefaultUrl(MainPage.HOTEL_MGMT_URL)
	final class HotelMainPage extends PageObject{
		public HotelMainPage(final WebDriver driver){
			super(driver);
		}
	}
	
	@FindBy(css="div.container-fluid ul li:nth-child(2) a")
	private WebElementFacade linkLogin;
	
	@FindBy(css="#username")
	private WebElementFacade txtUserName;
	
	@FindBy(css="#password")
	private WebElementFacade txtPassword;
	
	@FindBy(css="#doLogin")
	private WebElementFacade btnLogin;

	@FindBy(css="#logout")
	private WebElementFacade errorMsg;
	
	@FindBy(css="#hotelName")
	private WebElementFacade txtHotelName;
	
	@FindBy(css="#address")
	private WebElementFacade txtAddress;
	
	@FindBy(css="#owner")
	private WebElementFacade txtOwner;
	
	@FindBy(css="#phone")
	private WebElementFacade txtPhone;
	
	@FindBy(css="#email")
	private WebElementFacade txtEmail;
	
	@FindBy(css="#createHotel")
	private WebElementFacade btnCreate;
	
	@FindBy(xpath="//*[text()=' Hotel name']")
	private WebElementFacade entryResult;
	
	@FindBy(css="#search")
	private WebElementFacade txtSearch;
	
	@FindBy(xpath="//*[text()='Search results']")
	private WebElement searchResult;
	
	@FindBy(css="body div div.row.detail div")
	private WebElementFacade txtResult;
	
	@FindBy(css="#firstName")
	private WebElementFacade txtxFName;

	@FindBy(css="#lastName")
	private WebElementFacade txtLName;

	@FindBy(css="#totalPrice")
	private WebElementFacade txtPrice;

	@FindBy(css="#depositPaid")
	private WebElementFacade txtDeposit;

	@FindBy(css="#checkIn")
	private WebElementFacade txtCin;

	@FindBy(css="#checkOut")
	private WebElementFacade txtCout;
	
	@FindBy(id="createBooking")
	private WebElementFacade btnCreateCust;
	
	@FindBy(xpath="//div/div[3]/div[7]/span[2]")
	private WebElementFacade btnDelete;
	
	@FindBy(id="logout")
	private WebElementFacade linkLogout;
    
    @Loggable(Loggable.INFO)
	public void isUserOnHomePage() {
		PageObject page = new HotelMainPage(getDriver());
		page.open();
	}
    
    @Loggable(Loggable.INFO)
	public void noErrorMessageIsDisplayed() {
    	Assert.assertTrue("Error to login into system ", errorMsg.isVisible());
	}
    
    @Loggable(Loggable.INFO)
	public void errorMessageIsDisplayed() {
    	Assert.assertTrue("Error message is not displayed", errorMsg.isDisplayed());
	}
    
    @Loggable(Loggable.INFO)
	public void adminLogin(String usrName, String password) {
		linkLogin.click();
    	txtUserName.clear();
    	txtUserName.sendKeys(usrName);
    	txtPassword.clear();
    	txtPassword.sendKeys(password);
    	btnLogin.click();
	}

    @Loggable(Loggable.INFO)
	public void userInputsHotelDetailsAndRegister(String hotel,
			String cityName, String owner, String phone, String email) {
    	txtHotelName.clear();
    	txtHotelName.sendKeys(hotel);
    	txtAddress.clear();
    	txtAddress.sendKeys(cityName);
    	txtOwner.clear();
    	txtOwner.sendKeys(owner);
    	txtPhone.clear();
    	txtPhone.sendKeys(phone);
    	txtEmail.clear();
    	txtEmail.sendKeys(email);
	}

    @Loggable(Loggable.INFO)
	public void userClicksCreateButton() {
    	btnCreate.click();
	}

    @Loggable(Loggable.INFO)
	public void anEntryForTheHotelIsCreated() {
		Assert.assertTrue("Result is not displayed", txtHotelName.getText().isEmpty());
	}
    
    @Loggable(Loggable.INFO)
	public void userSearchesForAHotel(String hotelname) {
    	txtSearch.clear();
    	txtSearch.sendKeys(hotelname);
    	txtSearch.sendKeys(Keys.ENTER);
	}
    
    @Loggable(Loggable.INFO)
	public void hotelnameIsDisplayed(String hotelname) {
    	Assert.assertTrue("Search result is displayed", searchResult.isDisplayed());
	}
    
    @Loggable(Loggable.INFO)
	public void userClickOnSeachResult() {
		txtResult.click();
	}
    
    @Loggable(Loggable.INFO)
	public void userEntersDeatailForCustomer(String fname, String lname,
			String price, String deposit, String cin, String cout) {
    	txtxFName.clear();
    	txtxFName.sendKeys(fname);
    	txtLName.clear();
    	txtLName.sendKeys(lname);
    	txtPrice.clear();
    	txtPrice.sendKeys(price);
    	txtDeposit.selectByVisibleText(deposit);
    	txtCin.clear();
    	txtCin.sendKeys(cin);
    	txtCout.clear();
    	txtCout.sendKeys(cout);
	}
    
    @Loggable(Loggable.INFO)
	public void userClicksCreateCustButton() {
    	btnCreateCust.click();
	}
    
    @Loggable(Loggable.INFO)
	public void anEntryForTheCustomerIsCreated() {
       	Assert.assertTrue("Result is not displayed", txtxFName.getText().contentEquals(""));
    	//TODO
    	// Can add better validation
	}
    
    @Loggable(Loggable.INFO)
	public void userDeletesACustomerEntry() {
		btnDelete.click();
	}
    
    @Loggable(Loggable.INFO)
	public void customerEntryIsDeleted(String customer) {
    	txtSearch.clear();
    	txtSearch.sendKeys(customer);
    	txtSearch.sendKeys(Keys.ENTER);
    	Assert.assertTrue("Search result is displayed", searchResult.isDisplayed());
	}
    
    @Loggable(Loggable.INFO)
	public void thenUserClicksLogout() {
    	linkLogout.click();
	}
}