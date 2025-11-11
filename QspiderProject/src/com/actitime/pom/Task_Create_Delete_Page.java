package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Task_Create_Delete_Page {
	
	@FindBy(xpath = "//div[text()='Add New Task']")
	private WebElement AddNewTaskBtn;
	
	@FindBy(xpath = "//div[text()='Create new tasks']")
	private WebElement CreateNewTaskBtn;
	
	@FindBy(id = "createTasksPopup_customerSelector")
	private WebElement SelectCustDrop_Down;
	
	@FindBy(xpath = "(//ul[contains(@class,'x-menu-list')]//li[contains(@class,'x-menu-list-item')])[3]")
	private WebElement SelectfirstOptionCust;
	
	@FindBy(id = "createTasksPopup_projectSelector")
	private WebElement SelectProjectDrop_Down;
	
	@FindBy(xpath = "//ul[contains(@class,'x-menu-list')]//a[normalize-space(text())='Java']")
	private WebElement SelectfirstOptionProject;
	
	@FindBy(xpath = "//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[1]//td[1]/input")
	private WebElement Task1;
	
	@FindBy(xpath = "//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[2]//td[1]/input")
	private WebElement Task2;
	
	@FindBy(xpath = "//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[3]//td[1]/input")
	private WebElement Task3;
	
	@FindBy(xpath = "//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[4]//td[1]/input")
	private WebElement Task4;
	
	@FindBy(xpath = "//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[5]//td[1]/input")
	private WebElement Task5;
	
	@FindBy(xpath = "//span[text()='Create Tasks']")
	private WebElement CreateTaskBtn;
	
	//=== Delete Task
	
	@FindBy(xpath = "//div[@class='tasksTable']//input[@placeholder='Start typing name ...']")
	private WebElement searchNameBtn; 
	
	@FindBy(xpath = "//td[@class='names']//div[contains(@class,'subtitle ')]")
	private WebElement FirstOption;
	
	@FindBy(xpath = "//div[@class='taskNamePlaceholder']/../..//div[text()='ACTIONS']")
	private WebElement actionBtn;
	
	@FindBy(xpath = "(//div[contains(@class,'dropdownContainer actionsMenu')])[2]//div[text()='Delete']")
	private WebElement deleteBtn;
	
	@FindBy(xpath = "(//div[@class='buttonsContainer'])[1]/div/div/span")
	private WebElement deleteConfBtn;
	
	@FindBy(className = "toast")
	private WebElement ConfirmationMag;
	
	public Task_Create_Delete_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setAddNewTaskBtn() {
		AddNewTaskBtn.click();
	}

	public void setCreateNewTaskBtn() {
		CreateNewTaskBtn.click();
	}

	public void setSelectCustDrop_Down() {
		SelectCustDrop_Down.click();
	}

	public void setSelectfirstOptionCust() {
		SelectfirstOptionCust.click();
	}

	public void setSelectProjectDrop_Down() {
		SelectProjectDrop_Down.click();
	}

	public void setSelectfirstOptionProject() {
		SelectfirstOptionProject.click();
	}

	public void setTask1(String Task_Name) {
		Task1.sendKeys(Task_Name);
	}
	
	public void setTask2(String Task_Name) {
		Task2.sendKeys(Task_Name);
	}
	public void setTask3(String Task_Name) {
		Task3.sendKeys(Task_Name);
	}
	public void setTask4(String Task_Name) {
		Task4.sendKeys(Task_Name);
	}
	public void setTask5(String Task_Name) {
		Task5.sendKeys(Task_Name);
	}

	public void setClickTaskBtn() {
		CreateTaskBtn.click();
	}
	
	
	//===Delete Task
	public WebElement getSearchNameBtn() {
		return searchNameBtn;
	}

	public void setFirstOption() {
		FirstOption.click();
	}

	public void setActionBtn() {
		actionBtn.click();
	}

	public void setDeleteBtn() {
		deleteBtn.click();
	}

	public void setDeleteConfBtn() {
		deleteConfBtn.click();
	}
	
	public WebElement getConfirmationMag() {
		return ConfirmationMag;
	}

	
	
	
	
	
	
	

}
