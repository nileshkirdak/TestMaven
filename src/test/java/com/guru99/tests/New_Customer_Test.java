package com.guru99.tests;

import org.testng.annotations.Test;

import com.guru99.pages.New_customer_page;

public class New_Customer_Test extends BaseTest {
  @Test
  public void addNewCustomer() throws InterruptedException {
	  loginpage.loginToApplication(username, password);
	  
	  
	  Thread.sleep(5000);
	  add_new_customer.NewCustomerMethod();
  }
}
