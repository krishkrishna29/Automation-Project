package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.UserListPage;

@Listeners(com.actitime.generic.ListenerImplements.class)
public class UserModule extends BaseClass{ 
	
	@Test
	public void createUser() throws IOException {
		
		UserListPage u = new UserListPage(driver);
		HomePage h = new HomePage(driver);
		FileLib f = new FileLib();
		
		h.setUserBtn();
		
		//User 1
		String fname1 = f.readExcelData("addUser", 1, 0);
		String lname1 = f.readExcelData("addUser", 1, 1);
		String email1 = f.readExcelData("addUser", 1, 2);
		String un1 = f.readExcelData("addUser", 1, 3);
		String pwd1 = f.readExcelData("addUser", 1, 4);
		
		u.getAddUserBtn().click();
		
		u.getFirstNameTxb().sendKeys(fname1);
		u.getLastNameTxb().sendKeys(lname1);
		u.getEmailTxb().sendKeys(email1);
		u.getUserNameTxb().sendKeys(un1);
		u.getPassTxb().sendKeys(pwd1);
		u.getConfPassTxb().sendKeys(pwd1);
		u.getCreateUserBtn().click();
		Reporter.log("User 1 created successfully!",true);
		
		//User 2
		String fname2 = f.readExcelData("addUser", 2, 0);
		String lname2 = f.readExcelData("addUser", 2, 1);
		String email2 = f.readExcelData("addUser", 2, 2);
		String un2 = f.readExcelData("addUser", 2, 3);
		String pwd2 = f.readExcelData("addUser", 2, 4);
		
		u.getAddUserBtn().click();
		u.getFirstNameTxb().sendKeys(fname2);
		u.getLastNameTxb().sendKeys(lname2);
		u.getEmailTxb().sendKeys(email2);
		u.getUserNameTxb().sendKeys(un2);
		u.getPassTxb().sendKeys(pwd2);
		u.getConfPassTxb().sendKeys(pwd2);
		u.getCreateUserBtn().click();
		Reporter.log("User 2 created successfully!",true);
		
		
	}
	
	@Test
	public void deleteUser() throws InterruptedException, EncryptedDocumentException, IOException {
		FileLib f = new FileLib();
		HomePage h = new HomePage(driver);
		UserListPage u = new UserListPage(driver);
		
		String un1 = f.readExcelData("addUser", 1, 3);
		String un2 = f.readExcelData("addUser", 2, 3);
		
		h.setUserBtn();
		
		u.getSearchTxb().sendKeys(un1);

		u.getSearchTxb().click();
		Thread.sleep(2000);
		
		u.getSelectFirstSearchName().click();
		Thread.sleep(1000);
		
		u.getDeleteBtn().click();
		driver.switchTo().alert().accept();
		u.getSearchTxb().clear();
		Reporter.log("deleted user 1 successfully!",true);
		
		Thread.sleep(2000);
		u.getSearchTxb().sendKeys(un2);
	
		u.getSearchTxb().click();
		
		Thread.sleep(2000);
		
		u.getSelectFirstSearchName().click();
		Thread.sleep(1000);
	
		u.getDeleteBtn().click();
		driver.switchTo().alert().accept();
		u.getSearchTxb().clear();

		Reporter.log("deleted user 2 successfully!",true);
		

		
	}
	
	

}
