package com.guru99.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.guru99.pages.LoginPage;
import com.guru99.pages.New_customer_page;

import commonLibs.CommonDriver;
import commonLibs.ConfigUtils;

public class BaseTest {
	 
	  private static final String String = null;
	  CommonDriver cmnDriver;
	  String url;
	  WebDriver driver;
	  LoginPage loginpage;
	  New_customer_page  add_new_customer;
	  String currentWorkingDirectory;
	  String configFilePath;
	  Properties configProperty;
	  String browserType;
	  String username;
	  String password;
	  
	  @BeforeSuite
	  public void preSetup() throws IOException
	  {
		currentWorkingDirectory=System.getProperty("user.dir");
		configFilePath=currentWorkingDirectory+"\\config\\config.properties";
		configProperty=ConfigUtils.readProperties(configFilePath);

	  }
	  
	  @BeforeClass
	  public void setup() throws Exception {
		  url=configProperty.getProperty("baseUrl");
		  browserType=configProperty.getProperty("browserType");
		  cmnDriver=new CommonDriver(browserType);
		  driver=cmnDriver.getDriver();
		  loginpage=new LoginPage(driver);
		  cmnDriver.navigateToUrl(url);
	  }
		

		 @BeforeMethod
		  public void set_up() throws IOException  {
			  String path=System.getProperty("user.dir");
				String actual_path =path +"\\config\\config.properties";
				
				File f =new File(actual_path);
				FileInputStream fin = new FileInputStream(f);
			     
				Properties p=new Properties();
				p.load(fin);
				
				
				username = p.getProperty("userID");
				password = p.getProperty("userPassword");
			   
		 }
	  
		
		  @AfterClass public void closeDown()
		  { cmnDriver.closeAllBrowser();
		  }
		 
		  @AfterMethod 
		  public void takeScreenShot(ITestResult result)
		  {
			  
		  }
		 

}
