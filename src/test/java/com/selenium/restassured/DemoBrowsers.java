package com.selenium.restassured;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.selenium.base.Base;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoBrowsers extends Base{
	
	
	@Test
	public void launchBrowser() throws InterruptedException {
		
		WebDriver driver = Base.launchbrowser("FIREFOX");
		/*DesiredCapabilities caps = new DesiredCapabilities();
		caps.setAcceptInsecureCerts(true);
		WebDriverManager.chromedriver().setup();
		ChromeOptions coptions = new ChromeOptions();
		//FirefoxOptions foptions = new FirefoxOptions();
		//coptions.merge(caps);
		//WebDriver driver__ = new ChromeDriver(caps);
		WebDriver driver = new ChromeDriver(coptions);
		coptions.addArguments("--start-maximized");
		Thread.sleep(5000);
		coptions.addArguments("--incognito"); */
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("focusonforce@salesforce.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Sales234@#$");
		driver.findElement(By.xpath("//a[@id='privacy-link']")).click();
		Set<String> windowhandles = driver.getWindowHandles();
		Iterator<String> iterator = windowhandles.iterator();
		boolean hasnext = iterator.hasNext();
		if(hasnext) {
			String windowhandle = driver.getWindowHandle();
			driver.switchTo().window(windowhandle).close();
			driver.close();
		}
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		//driver.close();
		//driver.quit();
	}

}
