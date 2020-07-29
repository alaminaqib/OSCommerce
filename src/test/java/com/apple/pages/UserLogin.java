package com.apple.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserLogin {

WebDriver driver; 
	
	public UserLogin(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	
}
	@FindBy(id="email")
	WebElement userName;
	
	public void enterUsername(String uName) {
		userName.sendKeys(uName);
	}
}