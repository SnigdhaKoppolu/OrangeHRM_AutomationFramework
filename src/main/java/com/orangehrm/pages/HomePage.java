package com.orangehrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.orangehrm.actiondriver.ActionDriver;

public class HomePage {

	private ActionDriver actionDriver;
	
	//Define locators using By class
	private By adminTab = By.xpath("//span[text()='Admin']");
	private By userIDButton = By.className("oxd-userdropdown-name");
	private By logoutButton = By.xpath("//a[text()='Logout']");
	private By orangeHRMlogo = By.xpath("//div[@class='oxd-brand-banner']/img");
	
	//constructor
	public HomePage(WebDriver driver) {
		this.actionDriver = new ActionDriver(driver);
	}
	
	//Method to verify if Admin is visible
	public boolean isAdminTabVisible() {
		return actionDriver.isDisplayed(adminTab);
	}
	
	public boolean verifyOrangeHRMlogo() {
		return actionDriver.isDisplayed(adminTab);
	}
	
	//Method to perform logout operation
	public void logout() {
		actionDriver.click(userIDButton);
		actionDriver.click(logoutButton);
		
	}
}
