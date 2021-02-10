    package com.selenium.restassured;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Map;


public class AssuredRestApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
	}
	
	@Test
	public void test_1() {
		
		JSONObject request = new JSONObject();
		request.put("username", "jalakrishna@edata.com");
		request.put("password", "Sales1238eBpJpcTHk4Psa272dqB1q7Ry");
		request.put("grant_type", "password");
		request.put("client_id", "3MVG9oNqAtcJCF.E7tRfR1xmn80td4DTLWQsCdQcWd47yIbEpu3l_VayLUXbmubyHB7YHR.ZIXRvWp5fOBzFd");
		request.put("client_secret", "291A0A90C694DB1F0FA432A4AFEB410B93AC83E40F47FF962FB99C554EDF7F3C");
		
		System.out.println(request);
		
	

				
		//given().get("https://login.salesforce.com/services/oauth2/token").then().statusCode(200);
		
		given().header("Content-Type","application/json").
		//given().header("Content-Type","text/xml").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).body(request.toString()).
		when().
		post("https://login.salesforce.com/services/oauth2/token").
		//post("https://login.salesforce.com/services/Soap/u/38.0/").
		then().log().all();
	
	}
	

}
