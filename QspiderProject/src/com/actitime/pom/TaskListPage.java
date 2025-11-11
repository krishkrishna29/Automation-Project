package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.yaml.snakeyaml.events.Event.ID;

public class TaskListPage {

	
	@FindBy(xpath = "//div[text()='Add New']")
	private WebElement AddNewBtn;
	
	@FindBy(xpath = "//div[text()='+ New Customer']")
	private WebElement NewCustBtn;
	
	@FindBy(id = "customerLightBox_nameField")
	private WebElement CustNameTxb;
	
	@FindBy(id = "customerLightBox_descriptionField")
	private WebElement CustDesTxb;
	
	@FindBy(xpath = "//button[contains(text(),'Select an active')]/../../../..")
	private WebElement ExistingCusDropdown;
	
	@FindBy(xpath = "//a[text()='Our Company']")
	private WebElement OurCompanyLnk;
	
	@FindBy(xpath = "//span[text()='Create Customer']")
	private WebElement CreateCustBtn;
	
	@FindBy(className = "innerHtml")
	private WebElement confirmationMag;
	
	//=== Delete the User 
	
	@FindBy(xpath = "//input[@placeholder='Start typing name ...']")
	private WebElement searchNameBtn; 

	@FindBy(xpath = "//span[@class='highlightToken']/../../div[@class='editButton available']")
	private WebElement settingBtn;

	@FindBy(xpath = "//div[contains(@class,'edit_customer_sliding_pane')]//div[text()='ACTIONS']")
	private WebElement actionBtn;

	@FindBy(xpath = "//div[text()='Delete']")
	private WebElement deleteCustomerBtn;

	@FindBy(id = "customerPanel_deleteConfirm_submitTitle")
	private WebElement deleteConfirmBtn;

	@FindBy(xpath = "//*[contains(text(),'has been deleted')]")
	private WebElement deleteConfirmMsg;
	
	
	public TaskListPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddNewBtn() {
		return AddNewBtn;
	}

	public WebElement getNewCustBtn() {
		return NewCustBtn;
	}

	public WebElement getCustNameTxb() {
		return CustNameTxb;
	}

	public WebElement getCustDesTxb() {
		return CustDesTxb;
	}

	public WebElement getExistingCusDropdown() {
		return ExistingCusDropdown;
	}

	public WebElement getOurCompanyLnk() {
		return OurCompanyLnk;
	}

	public WebElement getCreateCustBtn() {
		return CreateCustBtn;
	}

	public WebElement getConfirmationMag() {
		return confirmationMag;
	}

	public WebElement getSearchNameBtn() {
		return searchNameBtn;
	}

	public WebElement getSettingBtn() {
		return settingBtn;
	}

	public WebElement getActionBtn() {
		return actionBtn;
	}

	public WebElement getDeleteCustomerBtn() {
		return deleteCustomerBtn;
	}

	public WebElement getDeleteConfirmBtn() {
		return deleteConfirmBtn;
	} 
	
	public WebElement getDeleteConfirmMsg() {
		return deleteConfirmMsg;
	} 
	
	

}
