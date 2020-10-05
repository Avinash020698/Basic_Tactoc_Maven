package com.avinash;

import org.testng.annotations.Test;
import com.avinash.Pages.*;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

public class Basic_Tactoc_Test {
	
	WebDriver driver=null;

	@BeforeTest
	public void BeforeTest() {
		System.setProperty("webdriver.chrome.driver",
				"H:\\Avinash\\jar Files\\selenium-java-3.141.59\\Browser drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.0.1.86/tatoc");
	}

	@Test
	public void BasicTactoc() throws Exception{
		
		PageFactory.initElements(driver,HomePage.class);
		PageFactory.initElements(driver, Grid_Gate.class);
		PageFactory.initElements(driver, Frame_Dungeon.class);
        PageFactory.initElements(driver, Drag_Around.class);
        PageFactory.initElements(driver, CommonElementsUsed.class);
        PageFactory.initElements(driver, Popup_Windows.class);
        PageFactory.initElements(driver, CommonElementsUsed.class);
        PageFactory.initElements(driver, Cookie_Handling.class);
        PageFactory.initElements(driver, CommonElementsUsed.class);
        
	}

	@AfterTest
	public void AfterTest() {

		driver.close();
		driver.quit();
		
	}

}
