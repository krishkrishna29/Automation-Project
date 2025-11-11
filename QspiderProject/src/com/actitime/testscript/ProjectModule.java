package com.actitime.testscript;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.ProjectPage;

@Listeners(com.actitime.generic.ListenerImplements.class)
public class ProjectModule extends BaseClass{
	
	@Test
	public void createProject1() throws InterruptedException, EncryptedDocumentException, IOException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		HomePage h = new HomePage(driver);
		ProjectPage p = new ProjectPage(driver);
		FileLib f = new FileLib();
		
		String Project_Name1 = f.readExcelData("CreateProject", 1, 0);
		String Project_1_Desc = f.readExcelData("CreateProject", 1, 1);
		
		h.setTaskBtn();
		p.setAddNewBtn();
		p.setNewProjectBtn();
		p.setNameTxb(Project_Name1);
		p.setCustomerDropdownBtn();Thread.sleep(2000);
		p.setFirstCustomerOption();
		p.setDescTxb(Project_1_Desc);
		p.setCreateBtn();
		String actualMsg = p.getMsgText().getText();
		Assert.assertEquals(actualMsg, "Project '" + Project_Name1 + "' has been created"); 
		Reporter.log("Project 1 is Created successfully!",true);
		 
	}
	
	@Test
	public void createProject2() throws InterruptedException, EncryptedDocumentException, IOException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		HomePage h = new HomePage(driver);
		ProjectPage p = new ProjectPage(driver);
		FileLib f = new FileLib();
		
		String Project_Name2 = f.readExcelData("CreateProject", 2, 0);
		String Project_1_Desc = f.readExcelData("CreateProject", 1, 1);
		
		h.setTaskBtn();
		p.setAddNewBtn();
		p.setNewProjectBtn();
		p.setNameTxb(Project_Name2);
		p.setCustomerDropdownBtn();Thread.sleep(2000);
		p.setFirstCustomerOption();
		p.setDescTxb(Project_1_Desc);
		p.setCreateBtn();
		String actualMsg = p.getMsgText().getText();
		Assert.assertEquals(actualMsg, "Project '" + Project_Name2 + "' has been created"); 
		Reporter.log("Project 2 is Created successfully!",true);
		 
	}
	
	@Test
	public void deleteProject1() throws InterruptedException, EncryptedDocumentException, IOException {
		
		HomePage h = new HomePage(driver);
		ProjectPage p = new ProjectPage(driver);
		FileLib f = new FileLib();
		
		String Project_Name1 = f.readExcelData("CreateProject", 1, 0);
		
		h.setTaskBtn();
		p.getSearchNameBtn().sendKeys(Project_Name1);
		Thread.sleep(2000); 
		    
		p.getSettingBtn().click();
		Thread.sleep(2000);
		    
		p.getActionBtn().click();Thread.sleep(2000);
		
		p.getDeleteBtn().click();Thread.sleep(2000);
		p.getDeletePerBtn().click();
		String actualMsg = p.getMsgText().getText();
		
	    Reporter.log("Project 1 is Deleted successfully!",true);
	 
	    Assert.assertEquals(actualMsg, "Project '" + Project_Name1 + "' has been deleted");
	}
	
	@Test
	public void deleteProject2() throws EncryptedDocumentException, IOException, InterruptedException {

		HomePage h = new HomePage(driver);
		ProjectPage p = new ProjectPage(driver);
		FileLib f = new FileLib();
		
		String Project_Name2 = f.readExcelData("CreateProject", 2, 0);
		
		h.setTaskBtn();
		p.getSearchNameBtn().sendKeys(Project_Name2);
		Thread.sleep(2000); 
		    
		p.getSettingBtn().click();
		Thread.sleep(2000);
		    
		p.getActionBtn().click();Thread.sleep(2000);
		
		p.getDeleteBtn().click();Thread.sleep(2000);
		p.getDeletePerBtn().click();
		String actualMsg = p.getMsgText().getText();
		
	    Reporter.log("Project 2 is Deleted successfully!",true);
	 
	    Assert.assertEquals(actualMsg, "Project '" + Project_Name2 + "' has been deleted");
		
	}

}
