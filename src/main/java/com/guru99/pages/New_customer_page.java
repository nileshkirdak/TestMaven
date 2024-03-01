package com.guru99.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class New_customer_page extends BasePage {

	

	@FindBy(how=How.LINK_TEXT,using="New Customemr")
	 private WebElement new_customer;
	
	@FindBy(how=How.NAME,using="name")
	private WebElement Customer_Name;
	
	@FindBy(how=How.XPATH,using="//input [@value='m']")
	private WebElement Gender;
	
	@FindBy(how=How.ID,using="dob")
	private WebElement Date_of_Birth;
	public New_customer_page(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	
	
		
		public void NewCustomerMethod()
		{
			
		
			elementcontrol.clickElement(new_customer);
			
			
			//elementcontrol.sendText(userPassword, password);
			//elementcontrol.clickElement(loginButton);
		}

	
}
