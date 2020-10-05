package com.avinash.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Cookie;

public class Cookie_Handling extends ElementFileHandler {
	
	WebDriver driver=null;
	
	public Cookie_Handling(WebDriver driver) throws Exception {
		
		this.driver=driver;
		super.Gives_Element_Value("Generate_token");
		driver.findElement(By.xpath(super.eleValue)).click();
		Thread.sleep(3000);
		
		super.Gives_Element_Value("Cookie");
		WebElement cookiE= driver.findElement(By.xpath(super.eleValue));
		String c= cookiE.getText();
		String[] split=c.split(": ");
		String value = split[1];
		driver.manage().addCookie(new Cookie("Token",value));
		
	}

}
