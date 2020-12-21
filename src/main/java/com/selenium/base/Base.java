package com.selenium.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	public static Base base = new Base();
	public WebDriver driver;
	
	private Base() {
		
	}
	
	public static Base getInstance() {
		
		return base;
	}
	
	public WebDriver InitiateBrowser(String drivername) {
		if(drivername.equalsIgnoreCase("firefox")) {
			new FirefoxDriver();
		}else if(drivername.equalsIgnoreCase("Chrome")){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/drivers/chromedriver");
		return driver = new ChromeDriver();
		}
		return driver;
		
	}
	
}
