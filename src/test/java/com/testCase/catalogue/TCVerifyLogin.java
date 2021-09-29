package com.testCase.catalogue;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.catalogue.pages.DriverSetup;
import com.catalogue.pages.LoginPage;

public class TCVerifyLogin extends DriverSetup{
	
	@Test
	public void verifiedLogin() {
		driver.get(baseUrl);
		
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		
		login.email("superadmin@gmail.com");
		login.password("superadmin");
		login.clickOnLogin();
		
		
	}

}
