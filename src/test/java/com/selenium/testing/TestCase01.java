package com.selenium.testing;

import org.testng.annotations.Test;

import com.selenium.base.Base;

public class TestCase01 {
	Base instance = Base.getInstance();
	
	@Test
	public void InvokeBrowser() {
		instance.InitiateBrowser("Chrome");
		instance.driver.close();
		
		

	}
	

	
}
;