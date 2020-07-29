package com.apple.stepdef;

import com.apple.common.applebase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserLogin extends applebase {

	@Given("^I am on the apple homepage$")
	public void i_am_on_the_apple_homepage()  {
	    
		LaunchBrowser();
	}

	@Given("^I click on the bag icon$")
	public void i_click_on_the_bag_icon()  {
	  
	}

	@When("^I click on Sign-In$")
	public void i_click_on_Sign_In()  {
	   
	}

	@When("^I enter my \"([^\"]*)\"$")
	public void i_enter_my(String arg1) {
	}

	@Then("^I am logged into my Apple account$")
	public void i_am_logged_into_my_Apple_account()  {
	    
	}



	

}
