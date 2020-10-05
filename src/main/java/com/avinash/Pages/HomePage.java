package com.avinash.Pages;

import org.openqa.selenium.*;



public class HomePage extends ElementFileHandler{

WebDriver driver=null ;
	
    public HomePage(WebDriver driver) throws Exception {
		

		this.driver=driver;
    	super.Gives_Element_Value("Basic_Course");
		driver.findElement(By.linkText(super.eleValue)).click();	
	}
}
