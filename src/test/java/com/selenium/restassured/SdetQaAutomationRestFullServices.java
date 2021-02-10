package com.selenium.restassured;


import java.lang.reflect.Method;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;



import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SdetQaAutomationRestFullServices {
	
	
	
	@Test
	public void createAccountJson() {
		
		JSONObject account = new JSONObject();
		account.put("Name", "ABC Corp");
		account.put("City", "San Antonio");
		String accountjson = account.toJSONString();
		System.out.println(accountjson);	
	}
	
	

	@Test
	public void getExample() {
		
		//https://ihm--qaint.my.salesforce.com/services/data/v44.0/sobjects/Account/0010r0000089oBtAAI
		//Specify BaseURI
		RestAssured.baseURI = "https://iheartmedia-dev-ed.my.salesforce.com/services/data/v44.0/sobjects";
		
		
		//Request Object
		RequestSpecification httprequest = RestAssured.given();
		httprequest.header("Content-Type","application/json")
		.header("Authorization","Bearer 00Df2000000DVE6!ARgAQEYAtD6AAmqkcH9RKKQPb2_py.dyGCYb_Vgsk2Ae9tKkLK5j2zV70O6PqNu.HuBKZxCTQ1GCxNmVxjKxRJOeRFbvMGuN");
		
		Response response = httprequest.request(io.restassured.http.Method.GET,"/Account/001f200001dEe0hAAC");
		String responsebody = response.getBody().asString();
		
		System.out.println(responsebody);
		System.out.println(response.statusCode());
		System.out.println(response.getStatusLine()    );
	}
	
	
}
