package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	private WebDriver driver; 
	
	@FindBy(id = "username")
	private WebElement UserTxb;
	
	@FindBy(name = "pwd")
	private WebElement PwdTxb;
	
	@FindBy(xpath = "//div[text()='Login ']")
	private WebElement UserBtn;
	
	@FindBy(id = "logoutLink")
	private WebElement logoutBtn;
	
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	public void Login(String un,String pwd) {
		UserTxb.sendKeys(un);
		PwdTxb.sendKeys(pwd);
		UserBtn.click();
	}
	
	public void logout() throws InterruptedException {
	    
		Thread.sleep(2000);
	    logoutBtn.click();
	}

}
