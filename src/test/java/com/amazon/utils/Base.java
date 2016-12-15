package com.amazon.utils;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	//in base class, we will have a protected driver
	protected WebDriver driver;
	//start the driver here
	
	//BeforeMethod runs before every test method
	@BeforeMethod
	public void setUp(){
		
	}
	
	//close the driver here
	@AfterMethod
	public void tesrDown(){
		if(driver != null){
			driver.close(); 
		}
	}
	
}
