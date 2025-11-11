package com.actitime.testscript;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.Task_Create_Delete_Page;

@Listeners(com.actitime.generic.ListenerImplements.class)
public class Task_Create_Delete_Module extends BaseClass{
	
	FileLib f;
	
	@Test
	public void CreateTask() throws InterruptedException, EncryptedDocumentException, IOException {
		
		f = new FileLib();
		
		HomePage h = new HomePage(driver);

		h.setTaskBtn();	
		
		Task_Create_Delete_Page n = new Task_Create_Delete_Page(driver);
	
		n.setAddNewTaskBtn();
	
		n.setCreateNewTaskBtn();Thread.sleep(1000);

		n.setSelectCustDrop_Down();Thread.sleep(1000);

		n.setSelectfirstOptionCust();Thread.sleep(1000);
		
		n.setSelectProjectDrop_Down();Thread.sleep(1000);
		
		n.setSelectfirstOptionProject();
		
		String T1 = f.readExcelData("Tasks", 1, 0);
		n.setTask1(T1);

		String T2 = f.readExcelData("Tasks", 2, 0);
		n.setTask2(T2);

		String T3 = f.readExcelData("Tasks", 3, 0);
		n.setTask3(T3);

		String T4 = f.readExcelData("Tasks", 4, 0);
		n.setTask4(T4);

		String T5 = f.readExcelData("Tasks", 5, 0);
		n.setTask5(T5);

		n.setClickTaskBtn();
		
		String actualMsg = "5 tasks have been created in project 'Java' of customer 'wqdqwwqf'";
		Assert.assertEquals(actualMsg, "5 tasks have been created in project 'Java' of customer 'wqdqwwqf'");
		Reporter.log("Tasks are Created !!!",true);
		
	}
	
	@Test
	public void DeleteAllTask() throws InterruptedException, EncryptedDocumentException, IOException {
		
		f= new FileLib();
		
		HomePage h = new HomePage(driver);

		h.setTaskBtn();
			
		Task_Create_Delete_Page d = new Task_Create_Delete_Page(driver);
			
			String T1 = f.readExcelData("Tasks", 1, 0);
			d.getSearchNameBtn().sendKeys(T1);
			Thread.sleep(2000);
			d.setFirstOption();
			Thread.sleep(2000);
			d.setActionBtn(); 
			d.setDeleteBtn();
			d.setDeleteConfBtn();
			String actualMsg1 = d.getConfirmationMag().getText();
			Assert.assertEquals(actualMsg1, "Task '"+T1+"' has been deleted");
			Thread.sleep(1000);
			driver.navigate().refresh();
			d.getSearchNameBtn().clear();
			Reporter.log("Task 1'"+T1+"' has been deleted",true);
			
			Thread.sleep(1000);
		
			String T2 = f.readExcelData("Tasks", 2, 0);
			d.getSearchNameBtn().sendKeys(T2);
			Thread.sleep(2000);
			d.setFirstOption();
			Thread.sleep(2000);
			d.setActionBtn(); 
			d.setDeleteBtn(); 
			d.setDeleteConfBtn();
			String actualMsg2 = d.getConfirmationMag().getText();
			Assert.assertEquals(actualMsg2, "Task '"+T2+"' has been deleted");
			Thread.sleep(1000);
			driver.navigate().refresh();
			d.getSearchNameBtn().clear();
			Reporter.log("Task 2'"+T2+"' has been deleted",true);
			
			Thread.sleep(1000);
			
			String T3 = f.readExcelData("Tasks", 3, 0);
			d.getSearchNameBtn().sendKeys(T3);
			Thread.sleep(2000);
			d.setFirstOption();
			Thread.sleep(2000);
			d.setActionBtn(); 
			d.setDeleteBtn(); 
			d.setDeleteConfBtn();
			String actualMsg3 = d.getConfirmationMag().getText();
			Assert.assertEquals(actualMsg3, "Task '"+T3+"' has been deleted");
			Thread.sleep(1000);
			driver.navigate().refresh();
			d.getSearchNameBtn().clear();
			Reporter.log("Task 3'"+T3+"' has been deleted",true);
			
			Thread.sleep(1000);
			
			String T4 = f.readExcelData("Tasks", 4, 0);
			d.getSearchNameBtn().sendKeys(T4);
			Thread.sleep(2000);
			d.setFirstOption();
			Thread.sleep(2000);
			d.setActionBtn(); 
			d.setDeleteBtn(); 
			d.setDeleteConfBtn();
			String actualMsg4 = d.getConfirmationMag().getText();
			Assert.assertEquals(actualMsg4, "Task '"+T4+"' has been deleted");
			Thread.sleep(1000);
			driver.navigate().refresh();
			d.getSearchNameBtn().clear();
			Reporter.log("Task 4'"+T4+"' has been deleted",true);
			
			Thread.sleep(1000);
			
			String T5 = f.readExcelData("Tasks", 5, 0);
			d.getSearchNameBtn().sendKeys(T5);
			Thread.sleep(2000);
			d.setFirstOption();
			Thread.sleep(2000);
			d.setActionBtn(); 
			d.setDeleteBtn(); 
			d.setDeleteConfBtn();
			String actualMsg5 = d.getConfirmationMag().getText();
			Assert.assertEquals(actualMsg5, "Task '"+T5+"' has been deleted");
			Thread.sleep(1000);
			driver.navigate().refresh();
			d.getSearchNameBtn().clear();
			Reporter.log("Task 5'"+T5+"' has been deleted",true);
			

	}


}
