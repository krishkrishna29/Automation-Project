package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProjectPage {
	
	//=== create Project
	
		@FindBy(xpath = "//div[text()='Add New']")
		private WebElement AddNewBtn; 
	
		@FindBy(xpath = "//div[text()='+ New Project']")
		private WebElement NewProjectBtn;
		
		@FindBy(id = "projectPopup_projectNameField")
		private WebElement nameTxb;
		
		@FindBy(xpath = "//button[contains(text(), 'Please Select Customer')]")
		private WebElement customerDropdownBtn;
		
		@FindBy(xpath = "//div[contains(@class,'x-layer x-menu at-dropdown-list-btn-menu')]/ul/li[3]")
		private WebElement firstCustomerOption;
		
		@FindBy(name = "projectDescriptionField")
		private WebElement DescTxb;
		
		@FindBy(xpath = "//span[text()='Create Project']")
		private WebElement createBtn;
		
		@FindBy(className = "innerHtml")
		private WebElement msgText;
		
	//=== delete Project
		
		@FindBy(xpath = "//input[@placeholder='Start typing name ...']")
		private WebElement searchNameBtn;
		
		@FindBy(xpath = "//span[@class='highlightToken']/../../div[@class='editButton available']")
		private WebElement settingBtn;

		@FindBy(xpath = "//div[contains(@class,'editProjectPanelHeader')]//div[text()='ACTIONS']")
		private WebElement actionBtn;
		
		@FindBy(xpath = "//div[contains(@class,'edit_project_sliding_panel')]//div[text()='Delete']")
		private WebElement deleteBtn;

		@FindBy(id = "projectPanel_deleteConfirm_submitTitle")
		private WebElement deletePerBtn;
		 
		//=== insalaization
		
		public ProjectPage(WebDriver driver) {
			
			PageFactory.initElements(driver, this);
		}
 
		//=== Utilization
		
		public void setAddNewBtn() {
			AddNewBtn.click();
		}

		public void setNewProjectBtn() {
			NewProjectBtn.click();
		}

		public void setNameTxb(String text) {
			nameTxb.sendKeys(text);
		}

		public void setCustomerDropdownBtn() {
			customerDropdownBtn.click();
		}

		public void setFirstCustomerOption() {
			firstCustomerOption.click();
		}

		public void setDescTxb(String text) {
			DescTxb.sendKeys(text);
		}

		public void setCreateBtn() {
			createBtn.click();
		}
		
		public WebElement getMsgText() {
			return msgText;
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
		
		public WebElement getDeleteBtn() {
			return deleteBtn;
		}

		public WebElement getDeletePerBtn() {
			return deletePerBtn;
		} 
		
		
		
		

}
