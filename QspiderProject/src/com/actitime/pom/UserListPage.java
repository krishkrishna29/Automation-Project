package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserListPage {
	
	@FindBy(xpath = "//div[text()='Add User']")
	private WebElement AddUserBtn;
	
	@FindBy(name = "firstName")
	private WebElement FirstNameTxb;
	
	@FindBy(name = "lastName")
	private WebElement LastNameTxb;
	
	@FindBy(name = "email")
	private WebElement EmailTxb;
	
	@FindBy(name = "username")
	private WebElement UserNameTxb;
	
	@FindBy(name = "password")
	private WebElement PassTxb;
	
	@FindBy(name = "passwordCopy")
	private WebElement ConfPassTxb;
	
	@FindBy(id = "userDataLightBox_commitBtn")
	private WebElement CreateUserBtn;
	
	// delete user
	@FindBy(xpath = "//input[@placeholder='Start typing name']")
	private WebElement searchTxb;
	
	@FindBy(xpath = "//td[@class='userNameCell first']")
	private WebElement SelectFirstSearchName;
	
	@FindBy(xpath = "//div[@class='deleteContainer']")
	private WebElement DeleteBtn;
	
	public UserListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getAddUserBtn() {
		return AddUserBtn;
	}

	public WebElement getFirstNameTxb() {
		return FirstNameTxb;
	}

	public WebElement getLastNameTxb() {
		return LastNameTxb;
	}

	public WebElement getEmailTxb() {
		return EmailTxb;
	}

	public WebElement getUserNameTxb() {
		return UserNameTxb;
	}

	public WebElement getPassTxb() {
		return PassTxb;
	}

	public WebElement getConfPassTxb() {
		return ConfPassTxb;
	}

	public WebElement getCreateUserBtn() {
		return CreateUserBtn;
	}

	public WebElement getSearchTxb() {
		return searchTxb;
	}

	public WebElement getSelectFirstSearchName() {
		return SelectFirstSearchName;
	}

	public WebElement getDeleteBtn() {
		return DeleteBtn;
	}

	

}
