package com.guru99.pages;

import org.openqa.selenium.WebDriver;

import commonLibs.ElementControl;

public class BasePage {

	WebDriver driver;
	public ElementControl elementcontrol;
	
	public BasePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		elementcontrol=new ElementControl(driver);
	}

}
