package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath = "//div[text()='TASKS']")
	private WebElement TaskBtn;
	
	@FindBy(id = "logoutLink")
	private WebElement LogoutBtn;
	
	@FindBy(xpath = "//div[text()='USERS']")
	private WebElement UserBtn;
	
	public HomePage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}

	public void setTaskBtn() {
		TaskBtn.click();
	}

	public void setLogoutBtn() {
		LogoutBtn.click();
	}

	public void setUserBtn() {
		UserBtn.click();
	}
	

}
