package com.actitime.generic;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;

public class BaseClass {
	
	 public static WebDriver driver;
	 LoginPage l;
	
	 @BeforeClass
	 public void openBrowser() throws IOException {
	 	ChromeOptions options = new ChromeOptions();
	 	options.addArguments("--incognito");

	 	FileLib cls = new FileLib();
	 	String url = cls.readPropertyData("url"); 

	 	driver = new ChromeDriver(options);
	 	
	 	driver.manage().window().maximize();
	 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 	driver.get(url);
	 	
	 	l = new LoginPage(driver);
	 }
	 

	 @BeforeMethod
	 public void login() throws EncryptedDocumentException, IOException {
	 	FileLib cls = new FileLib();
	 	String un = cls.readPropertyData("username");
	 	String pwd = cls.readPropertyData("password");
	 	
	 	l = new LoginPage(driver);

	 	l.Login(un, pwd);
	 	Reporter.log("LogIn", true);
	 }

	@AfterMethod
	public void logout() throws InterruptedException {
		
		l.logout();
		Reporter.log("LogOut",true);
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
		Reporter.log("closeBrowser",true);
		
	}
	

}
