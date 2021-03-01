package com.selenium.java8learning;

import java.util.ArrayList;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.NamingStrategy.SuffixingRandom.BaseNameResolver.ForGivenType;

class SeleniumObjects {
	
	String browser;
	String name;
	int salary;
	WebDriver driver;
	String var;
	WebElement ele;
	
	//WebDriverManager drivermanager;
	
	SeleniumObjects(String browser,String name, int salary){
		this.browser = browser;
		this.name = name;
		this.salary = salary;
	//	this.driver = driver;
	//	this.drivermanager = drivermanager;
	}

	
}



public class FunctionInterfaceExample {

	public static void main(String[] args) {
		ArrayList<SeleniumObjects> sobjects = new ArrayList<SeleniumObjects>();
		sobjects.add(new SeleniumObjects("chrome","John",1500));
		sobjects.add(new SeleniumObjects("chrome","Mary",2300));
		sobjects.add(new SeleniumObjects("firefox","Mary",2200));
		//sobjects.add(new SeleniumObjects("firefox", new FirefoxDriver(), WebDriverManager.firefoxdriver()));
		
		Function<SeleniumObjects, Integer> fn = e->{	
			int sal = e.salary;		
			if(sal>=1000 && sal<=2000) {
				return(sal *10/100);
			} else if(sal>1500 && sal<=2500) {
				return (sal *20/100);
			} else return (sal *40/100);
		};
		
		Function<SeleniumObjects, WebDriver> dr = a->{
			WebDriver driver;
			if(a.browser.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				return driver;
			}else if(a.browser.equals("firefox")) 
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				return driver;	
		};
		
		
		Function<String, WebDriver> webdriver = v->{
			WebDriver driver;
			if(v.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				return driver;
			} else if(v.equalsIgnoreCase("firefox"))
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				return driver;
		};
		

		
		//sobjects.forEach(action);
		/*for(SeleniumObjects obj : sobjects) {
			Integer bonus = fn.apply(obj);
			System.out.println("Bonus : " +bonus);
			WebDriver driver = dr.apply(obj);
			driver.get("https://www.facebook.com/");
			driver.quit();
		} */
		
		
		//Function Changing 
		// andThen()
		// compose()
		
		/*WebDriver driver = webdriver.apply("chrome");
		driver.get("https://www.facebook.com/");
		driver.quit(); */
		
		Function<WebDriver, WebDriver> launchurl = url->{
			url.get("https://www.facebook.com/");
			//driver.quit();
			return url;
		};
		
		Function<WebDriver, WebDriver> urlquit = quit->{
			quit.quit();
			return quit;
		};
		
		
		webdriver.andThen(launchurl).andThen(urlquit).apply("chrome");
		
		
		
		
		
		
	
		
		
	}

}
