package com.avinash.Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonElementsUsed extends ElementFileHandler {

	WebDriver driver=null;
	public CommonElementsUsed(WebDriver driver) throws Exception{
		this.driver=driver;
		super.Gives_Element_Value("Proceed");
		driver.findElement(By.linkText(super.eleValue)).click();
	}
}
