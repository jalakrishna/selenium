package com.selenium.java8learning;

import java.util.function.Function;
import java.util.function.Predicate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FunctionalInterfaceDemo3Function {

	public static void main(String[] args) {
		
		WebDriver driver;
		/*Function<String, WebDriver> sel = browser->{
			
			//Predicate<String>  pres = j->(j=="Jala");
			//WebDriver driver;
			if(browser.equals("chrome")) {
				WebDriverManager.chromedriver().setup();
				//driver = new ChromeDriver();
			} else if(browser.equals("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				//driver = new FirefoxDriver();
			}
			//return driver;
	}; */

 }
}
