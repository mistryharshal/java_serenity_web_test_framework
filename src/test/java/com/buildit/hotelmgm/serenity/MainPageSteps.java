package com.buildit.hotelmgm.serenity;
/**
 * @author Harshal Mistry
 *
 */
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.buildit.hotelmgm.pages.MainPage;
import com.jcabi.aspects.Loggable;

public class MainPageSteps  extends ScenarioSteps{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MainPage onMainpage(){
		return getPages().get(MainPage.class);
	}
	

	@Loggable(Loggable.INFO)
    @Step
	public void isUserOnHomePage() {
		onMainpage().isUserOnHomePage();
	}

	@Loggable(Loggable.INFO)
	@Step
	public void noErrorMessageIsDisplayed() {
		onMainpage().noErrorMessageIsDisplayed();
	}

	@Loggable(Loggable.INFO)
	@Step
	public void errorMessageIsDisplayed() {
		onMainpage().errorMessageIsDisplayed();
	}


	public void adminLogin(String usrName, String password) {
		onMainpage().adminLogin(usrName, password);
	}

	@Loggable(Loggable.INFO)
	@Step
	public void userSearchesForAHotel(String hotelname) {
		onMainpage().userSearchesForAHotel(hotelname);
	}

	@Loggable(Loggable.INFO)
	@Step
	public void hotelnameIsDisplayed(String hotelname) {
		onMainpage().hotelnameIsDisplayed(hotelname);
	}

	@Loggable(Loggable.INFO)
	@Step
	public void userClickOnSeachResult() {
		onMainpage().userClickOnSeachResult();
	}

	@Loggable(Loggable.INFO)
	@Step
	public void userEntersDeatailForCustomer(String fname, String lname,
			String price, String deposit, String cin, String cout) {
		onMainpage().userEntersDeatailForCustomer(fname, lname,
				price, deposit, cin, cout);
	}

	@Loggable(Loggable.INFO)
	@Step
	public void userClicksCreateButton() {
		onMainpage().userClicksCreateButton();
	}

	@Loggable(Loggable.INFO)
	@Step
	public void userClicksCreateCustButton() {
		onMainpage().userClicksCreateCustButton();
	}

	@Loggable(Loggable.INFO)
	@Step
	public void anEntryForTheCustomerIsCreated() {
		onMainpage().anEntryForTheCustomerIsCreated();
	}

	@Loggable(Loggable.INFO)
	@Step
	public void userInputsHotelDetailsAndRegister(String hotel,
			String cityName, String owner, String phone, String email) {
		onMainpage().userInputsHotelDetailsAndRegister(hotel,
				cityName, owner, phone, email);
	}

	@Loggable(Loggable.INFO)
	@Step
	public void anEntryForTheHotelIsCreated() {
		onMainpage().anEntryForTheHotelIsCreated();
	}
	
	@Loggable(Loggable.INFO)
	@Step
	public void userDeletesACustomerEntry() {
		onMainpage().userDeletesACustomerEntry();
	}
	 
	@Loggable(Loggable.INFO)
	@Step
	public void customerEntryIsDeleted(String customer) {
		onMainpage().customerEntryIsDeleted(customer);
	}

	@Loggable(Loggable.INFO)
	@Step
	public void thenUserClicksLogout() {
		onMainpage().thenUserClicksLogout();
	}

}