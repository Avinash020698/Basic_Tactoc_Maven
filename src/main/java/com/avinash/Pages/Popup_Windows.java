package com.avinash.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Popup_Windows extends ElementFileHandler {
	
	WebDriver driver=null;
	String currentWindow;
	
	public Popup_Windows(WebDriver driver) throws Exception {
		this.driver=driver;
		currentWindow= driver.getWindowHandle();
		super.Gives_Element_Value("Launch_Popup_Window");
		driver.findElement(By.linkText(super.eleValue)).click();
		Thread.sleep(4000);

		for(String childTab: driver.getWindowHandles()) {
			driver.switchTo().window(childTab);
		}
		
		super.Gives_Element_Value("popup_searchbox");
		driver.findElement(By.xpath(super.eleValue)).sendKeys("Avinash");
		Thread.sleep(1000);
		
		super.Gives_Element_Value("submit_button");
		driver.findElement(By.id(super.eleValue)).click();
		Thread.sleep(1000);
		driver.switchTo().window(currentWindow);
	}

}
