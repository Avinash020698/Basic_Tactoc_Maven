package com.avinash.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

public class Frame_Dungeon extends ElementFileHandler {
WebDriver driver=null;

	public Frame_Dungeon(WebDriver driver) throws Exception {
		

		this.driver=driver;
		driver.switchTo().frame("main");
		super.Gives_Element_Value("Box1");
		WebElement Box1 = driver.findElement(By.xpath(super.eleValue));
		String Box1rgb = Box1.getCssValue("background-color");
		String box1hexColor = Color.fromString(Box1rgb).asHex();


		driver.switchTo().frame("child");
		super.Gives_Element_Value("Box2");
		WebElement Box2 = driver.findElement(By.xpath(super.eleValue));
		String Box2rgb = Box2.getCssValue("background-color");
		String box2hexColor = Color.fromString(Box2rgb).asHex();
		driver.switchTo().parentFrame();

		while (!box1hexColor.equals(box2hexColor)) {
			super.Gives_Element_Value("Repaint_Box");
			driver.findElement(By.partialLinkText(super.eleValue)).click();
			driver.switchTo().frame("child");
			super.Gives_Element_Value("Box2");
			Box2 = driver.findElement(By.xpath(super.eleValue));
			Box2rgb = Box2.getCssValue("background-color");
			box2hexColor = Color.fromString(Box2rgb).asHex();
			driver.switchTo().parentFrame();
		}
		super.Gives_Element_Value("Proceed");
		driver.findElement(By.linkText(super.eleValue)).click();
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
	}
}
