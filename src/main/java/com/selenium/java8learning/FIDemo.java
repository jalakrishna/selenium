package com.selenium.java8learning;

import java.util.function.Predicate;

import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

@FunctionalInterface
interface Mathoperation{
	int operation(int a, int b);
}


interface LaunchBrowser{
	WebDriver launchBrowser(String browser, WebDriverManager drivermanager,WebDriver driver);
}



@FunctionalInterface	
interface FIDemointerface{
	Integer getm1();
}


class FIDisco implements FIDemointerface, Mathoperation{

	@Override
	public Integer getm1() {
		
		return 007;
	}
	
	
	public String getm2(String title) {
		
		return title;
	}


	@Override
	public int operation(int a, int b) {
		return 0;
	}
	
	public int operate(int a, int b, Mathoperation mathoperate) {
		return mathoperate.operation(a, b);
		
	}
	
	public String InvokeBrowser(String browser){
		
		return browser;
	}

}





public class FIDemo {

	String name ;
	Integer age;
	String city;
	
	
	public FIDemo(String name, int age, String city){
		this.name = name;
		this.age = age;
		this.city = city;
		
	}
	
	
	public static void main(String[] args) {
		

		
	FIDemo demo = new FIDemo("Vishal", 21, "Houston");
	System.out.println(demo.age);
	System.out.println(demo.city);
	
	Predicate<FIDemo> pdemo = var->(var.age > 20);
	System.out.println(pdemo.test(demo));
	
	FIDisco fd = new FIDisco();
	System.out.println(fd.getm1());
	
	FIDemointerface fdi = new FIDisco();
	System.out.println(fdi.getm1());
	
	
	FIDemointerface fdi1 = ()->8;
	System.out.println(fdi1.getm1());
	//FIDemointerface fdi2 = (String title)-> 'SDET';
	
	Mathoperation add = (int a, int b) -> a + b;
	Mathoperation sub = (int a, int b ) -> a - b;
	
	System.out.println(fd.operate(5, 13, add));
	System.out.println(fd.operate(5, 13, sub));
	
	LaunchBrowser browse = (String browser, WebDriverManager drivermanager, WebDriver driver) -> 
		{
			if(browser.equalsIgnoreCase("chrome")) {
				drivermanager.chromedriver();
				driver = new ChromeDriver();
				System.out.println("Browser capture");
			} else if(browser.equalsIgnoreCase("firefox")) {
				drivermanager.firefoxdriver();
				driver = new FirefoxDriver();
			}
			return driver;
		};
		String drivers = fd.InvokeBrowser("CHROME");
	//drivers.get("https://www.facebook.com/");

	}

}
