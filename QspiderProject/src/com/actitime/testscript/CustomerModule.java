package com.actitime.testscript;



import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

@Listeners(com.actitime.generic.ListenerImplements.class)
public class CustomerModule extends BaseClass{
	
	@Test
	public void createCustomer() throws InterruptedException, EncryptedDocumentException, IOException {
		
		TaskListPage t = new TaskListPage(driver);
		HomePage h = new HomePage(driver);
		FileLib f = new FileLib();
		
		String CustName = f.readExcelData("createCustomer", 1, 1);
		String CustDes = f.readExcelData("createCustomer", 1, 2);
		 
		h.setTaskBtn();
		t.getAddNewBtn().click();
		t.getNewCustBtn().click();
		t.getCustNameTxb().sendKeys(CustName);
		t.getCustDesTxb().sendKeys(CustDes);
		WebElement drop = t.getExistingCusDropdown();
		drop.click();
		t.getOurCompanyLnk().click();
		
		t.getCreateCustBtn().click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	    wait.until(ExpectedConditions.visibilityOf(t.getConfirmationMag()));
		
		String actualMsg = t.getConfirmationMag().getText();
		Reporter.log("Customer is Created successfully!",true);
		Assert.assertEquals(actualMsg, "Customer '" + CustName + "' has been created");
		
		
	}
	
	@Test
	public void deleteCustomer() throws EncryptedDocumentException, IOException, InterruptedException {

	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	    TaskListPage t = new TaskListPage(driver);
	    HomePage h = new HomePage(driver);
	    FileLib f = new FileLib();
 
	    String custName = f.readExcelData("createCustomer", 1, 1);

	    h.setTaskBtn();
	    
	    t.getSearchNameBtn().sendKeys(custName);
	    Thread.sleep(2000); 
	    
	    t.getSettingBtn().click();
	    Thread.sleep(2000);
	    
	    t.getActionBtn().click();

	    t.getDeleteCustomerBtn().click();

	    t.getDeleteConfirmBtn().click();
	    
	    String msg = t.getDeleteConfirmMsg().getText();
	    Reporter.log("Customer is Deleted successfully!",true);
	 
	    Assert.assertEquals(msg, "Customer '" + custName + "' has been deleted");
	}

}
