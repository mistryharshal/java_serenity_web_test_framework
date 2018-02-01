package com.buildit.hotelmgm.steps;

import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.buildit.hotelmgm.serenity.MainPageSteps;
import com.jcabi.aspects.Loggable;


public class MainPageDefSteps {

	
    @Steps
    MainPageSteps mainPageSteps;

	@Loggable(Loggable.INFO)
	@Given("the user is on the application login page")
	public void givenUserOnHomePage(){
		mainPageSteps.isUserOnHomePage();
	}
	
	@Loggable(Loggable.INFO)
	@When("the user click Login and enters Username $usrName and Password $password and clicks Login button")
	public void whenUserLogin(final String usrName, final String password){
		mainPageSteps.adminLogin(usrName, password);
	}
	
	@Loggable(Loggable.INFO)
	@Then("user should  be able to login into application")
	public void thenNoErrorMessageIsDisplayed(){
		mainPageSteps.noErrorMessageIsDisplayed();
	}
	
	@Loggable(Loggable.INFO)
	@When("user enters hotel deatails Hotelname $hotel address $cityName owner $owner phone $phone email $email")
	public void whenUserInputsHotelDetailsAndRegister(final String hotel, final String cityName, final String owner, final String phone, final String email){
		mainPageSteps.userInputsHotelDetailsAndRegister(hotel, cityName, owner, phone, email);
	}

	@Loggable(Loggable.INFO)
	@When("user clicks create button")
	public void whenUserClicksCreateButton(){
		mainPageSteps.userClicksCreateButton();
	}

	
	@Loggable(Loggable.INFO)
	@Then("an entry for the hotel is created")
	public void thenAnEntryForTheHotelIsCreated(){
		mainPageSteps.anEntryForTheHotelIsCreated();
	}
	
	
	@Loggable(Loggable.INFO)
	@When("user searches for a hotel $hotelname")
	public void whenUserSearchesForAHotel(final String hotelname){
		mainPageSteps.userSearchesForAHotel(hotelname);
	}
	
	@Loggable(Loggable.INFO)
	@Then("hotel $hotelname is displayed")
	public void thenHotelnameIsDisplayed(final String hotelname){
		mainPageSteps.hotelnameIsDisplayed(hotelname);
	}
	
	@Loggable(Loggable.INFO)
	@When("user click on seach result")
	public void whenUserClickOnSeachResult(){
		mainPageSteps.userClickOnSeachResult();
	}
	
	@Loggable(Loggable.INFO)
	@When("user deletes a customer $customer entry")
	public void whenUserDeletesACustomerEntry(){
		mainPageSteps.userDeletesACustomerEntry();
	}
	
	@Loggable(Loggable.INFO)
	@Then("customer $customer entry is deleted")
	public void thenCustomerEntryIsDeleted(final String customer){
		mainPageSteps.customerEntryIsDeleted(customer);
	}
	
	@Loggable(Loggable.INFO)
	@When("user enter deatails firstname $fname lastname $lname price $price deposit $deposit checkin $cin checkout $cout")
	public void whenUserEntersDeatailForCustomer (final String fname, final String lname, final String price, final String deposit, final String cin, final String cout){
		mainPageSteps.userEntersDeatailForCustomer(fname, lname, price, deposit, cin, cout);
	}
	
	
	@Loggable(Loggable.INFO)
	@When("user clicks create_cut button")
	public void whenUserClicksCreateCustButton(){
		mainPageSteps.userClicksCreateCustButton();
	}
	
	@Loggable(Loggable.INFO)
	@Then("user clicks logout")
	public void thenUserClicksLogout(){
		mainPageSteps.thenUserClicksLogout();
	}
	
	@Loggable(Loggable.INFO)
	@Then("an entry for the customer is created")
	public void thenAnEntryForTheCustomerIsCreated(){
		mainPageSteps.anEntryForTheCustomerIsCreated();
	}
	
}
