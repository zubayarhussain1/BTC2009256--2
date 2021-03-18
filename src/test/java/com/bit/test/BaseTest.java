package com.bit.test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseTest {
	
	WebDriver dr;
	@Before
	public void openbroswer() {
		
		System.setProperty("webdriver.chrome.driver","/Users/zubayarhussain/Downloads/chromedriver");
		dr = new ChromeDriver();
	
		
		dr.get("https://www.express.com");
		
		
		
	}

	
	
	@After
	public void closebrowser() {
	dr.quit();	
		
		
	}
	
	
}
