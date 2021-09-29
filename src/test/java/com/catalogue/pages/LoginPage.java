package com.catalogue.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends DriverSetup {

	@FindBy(id = "email")
	@CacheLookup
	WebElement emailLocator;
	
	
	@FindBy(how = How.ID, using = "password")
	@CacheLookup
	WebElement passwordLocator;
	
	@FindBy(how = How.XPATH, using = "/html/body/div/div/div/div[1]/div/form/div[4]/div/button")
	@CacheLookup
	WebElement clickOnLoginBtnLocator;
	
	
	
	
	public void email(String sendEmail) {
		emailLocator.sendKeys(sendEmail);
	}
	
	public void password(String sendPass) {
		passwordLocator.sendKeys(sendPass);
	}
	
	
   public void clickOnLogin() {
	   clickOnLoginBtnLocator.click();
   }
	
	
}
