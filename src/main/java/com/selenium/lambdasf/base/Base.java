package com.selenium.lambdasf.base;

import java.util.function.Function;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
		
	
	
	
	Function<String, WebDriver> wd = strObj->{
		WebDriver driver;
		if(strObj.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			return driver;
		} else if(strObj.equalsIgnoreCase("firefox"))
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			return driver;
		
	}; 


}
