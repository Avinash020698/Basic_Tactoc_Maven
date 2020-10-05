package com.avinash.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Grid_Gate extends ElementFileHandler{

	WebDriver driver= null;
	public Grid_Gate(WebDriver driver) throws Exception {
		
		this.driver=driver;
		super.Gives_Element_Value("greenbox");
		driver.findElement(By.className(super.eleValue)).click();
	}
}
