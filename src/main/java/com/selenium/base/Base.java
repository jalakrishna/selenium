package com.selenium.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	
	public WebDriver InitiateBrowser(String drivername) {
		WebDriver driver = null;
		if(drivername.equalsIgnoreCase("firefox")) {
			new FirefoxDriver();
		}else if(drivername.equalsIgnoreCase("Chrome")){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/drivers/chromedriver");
		return driver = new ChromeDriver();
		}
		return driver;
		
	}
	
	
	public static WebDriver launchbrowser(String browser) {
		
		WebDriver driver = null;
		
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if(browser.equalsIgnoreCase("firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if(browser.equalsIgnoreCase("opera")) {
			WebDriverManager.operadriver();
			driver = new OperaDriver();
		} 
		
		return driver;
		
	}
	
}
