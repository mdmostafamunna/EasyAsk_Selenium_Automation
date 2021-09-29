package com.catalogue.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CategoriesPage {
	
	
	// click on the tab for category
	@FindBy(how = How.XPATH, using = "/html/body/div/div/nav/ul/li[3]/a")
	@CacheLookup
	WebElement clickOnCatalogueLocator;
	
	@FindBy(how = How.XPATH, using = "//a[@href='http://18.209.122.163/admin/category']")
	@CacheLookup
	WebElement clickOnCategoryLocator;
	
	
	// click on Add Category button in category page
	@FindBy(how = How.XPATH, using = "//a[@href='http://18.209.122.163/admin/category/create']")
	@CacheLookup
	WebElement clickOnAddCategoryLocator;
	
	
	// Add Category input field locators
	@FindBy(how = How.NAME, using = "category_code")
	@CacheLookup
	WebElement categoryCode;
	
	
	@FindBy(how = How.NAME, using = "category_name")
	@CacheLookup
	WebElement categoryName;
	
	@FindBy(how = How.NAME, using = "pim_category_id")
	@CacheLookup
	WebElement pimCategoryID;
	
	@FindBy(how = How.NAME, using = "template")
	@CacheLookup
	WebElement template;
	
	@FindBy(how = How.NAME, using = "image")
	@CacheLookup
	WebElement image;
	
	@FindBy(how = How.NAME, using = "searchable")
	@CacheLookup
	WebElement searchable;
	
	// Click on Products tab
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div/div/div/form/div[1]/ul/li[2]/a")
	@CacheLookup
	WebElement clickOnProductSubTab;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"tab_products\"]/div/div[2]/input")
	@CacheLookup
	WebElement searchBoxSelectedList;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"tab_products\"]/div/div[6]/div/button")
	@CacheLookup
	WebElement clickOnSearchBtn;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"addProductModal\"]/div/div/div[2]/div/div/div[1]/input")
	@CacheLookup
	WebElement searchBoxInModal;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"saveActions\"]/button[1]")
	@CacheLookup
	WebElement clickOnSaveBtn;
	
	
	public void catalogue() {
		clickOnCatalogueLocator.click();
	}
	
	public void category() {
		clickOnCategoryLocator.click();
	}
	
	public void addCategory() {
		clickOnAddCategoryLocator.click();
	}
	
	public void categoryCode(String catCode) {
		categoryCode.sendKeys(catCode);
	}
	
	public void categoryName(String catName) {
		categoryName.sendKeys(catName);
	}
	
	public void pimCategoryID(String pimCateID) {
		pimCategoryID.sendKeys(pimCateID);
	}
	
	public void template(String temp) {
		template.sendKeys(temp);
	}
	
	
	public void image(String img) {
		image.sendKeys(img);
	}
	
	
	public void clickOnSaveBtn() {
		clickOnSaveBtn.click();
	}
	

	
	
	
	
	
	
	
	

}
