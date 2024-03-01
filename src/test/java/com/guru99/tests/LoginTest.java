package com.guru99.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import commonLibs.ConfigUtils;

public class LoginTest extends BaseTest {
 
	SoftAssert softAssert = new SoftAssert();
	
	//@Parameters({"userId","userPassword"})

	
	@Test
  public void verifyUserLoginWithCredentials()  throws IOException
	{
		 loginpage.loginToApplication(username, password);
		 String expectedTitle="Guru99 Bank Manager HomePage";
         String actualTitle=cmnDriver.getTitleofWebPage();
		  
		  Assert.assertEquals(actualTitle, expectedTitle);
		  softAssert.assertEquals(false, false);
	}
  
}