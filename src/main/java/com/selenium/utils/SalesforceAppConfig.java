package com.selenium.utils;

import org.json.simple.JSONObject;

import com.google.gson.Gson;

public class SalesforceAppConfig {
	
	private static final SfdcTestData testdata;
	
static {

	Gson gson = new Gson();
	JSONObject jsondata = CommonUtils.getJsonData("sfdctestdata.json", "src/main/resources/testdata/sfdc/");
	testdata = gson.fromJson(jsondata.toJSONString(), SfdcTestData.class);
	
}

	public static String getUsername() {
		return testdata.logininfo.username.toString();
	
	}
	
	
	
}     