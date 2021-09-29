package com.testCase.catalogue;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.catalogue.pages.CategoriesPage;
import com.catalogue.pages.DriverSetup;

public class AddCategoryWithOutProducts extends DriverSetup {
	
	@Test
	public void addCategory() throws InterruptedException {
		VerifyLogin logIn = new VerifyLogin();
		logIn.verifiedLogin();
		
		CategoriesPage category = PageFactory.initElements(driver, CategoriesPage.class);
		
		
		category.catalogue();
		category.category();
		category.addCategory();
		category.categoryCode("TestCat1154");
		category.categoryName("Test Category 2");
		category.pimCategoryID("PIM");
		category.image("C:\\Users\\Mediusware\\Desktop\\Demo Images\\Demo-5.jpg");
		category.clickOnSaveBtn();
		
		Thread.sleep(5000);
		
		
		
		
		
	}

}
