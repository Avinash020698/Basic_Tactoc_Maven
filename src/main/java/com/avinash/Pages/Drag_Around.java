package com.avinash.Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;


public class Drag_Around extends ElementFileHandler{

	WebDriver driver;
	Actions act;
	WebElement from;
	WebElement to;
	
	public Drag_Around(WebDriver driver) throws Exception {
		this.driver = driver;
		act = new Actions(driver);
		super.Gives_Element_Value("Dragbox");
	    from = driver.findElement(By.id(super.eleValue));
	    super.Gives_Element_Value("Dropbox");
		to = driver.findElement(By.id(super.eleValue));
		act.dragAndDrop(from, to).perform();
		Thread.sleep(1000);
	}

}
