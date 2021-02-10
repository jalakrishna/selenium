package com.selenium.restassured;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import net.bytebuddy.implementation.bytecode.assign.Assigner.EqualTypesOnly;
import static io.restassured.RestAssured.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.selenium.files.sfobjectdata;

import static org.hamcrest.Matchers.*;

public class DemoPostRequest {
	
	public static HashMap map = new HashMap<>();
	
	String UserName = "jalakrishna@edata.com";
	String Password = "Sales123VZzezybxjumwSguG6NF0jIyxO";
	String Base_url = "https://login.salesforce.com";
	String Instance_url = "https://iheartmedia-dev-ed.my.salesforce.com";
	String GrantService = "/services/oauth2/token?grant_type=password";
	String ClientID = "3MVG9oNqAtcJCF.E7tRfR1xmn80td4DTLWQsCdQcWd47yIbEpu3l_VayLUXbmubyHB7YHR.ZIXRvWp5fOBzFd";
	String ClientSecret = "291A0A90C694DB1F0FA432A4AFEB410B93AC83E40F47FF962FB99C554EDF7F3C";
	String baseURI = Base_url+GrantService+"&client_id=" +ClientID+"&client_secret" +ClientSecret+"&username="+UserName+"&password="+Password;
	String AccessToken;
	

	public String getAccessToken() {
		RestAssured.baseURI = Base_url;  
		   String response = given()
		   .contentType("multipart/form-data")
		   .multiPart("username", "jalakrishna@edata.com")
		    .multiPart("password", "Sales123")
		    .multiPart("grant_type", "password")
		    .multiPart("client_id", "3MVG9oNqAtcJCF.E7tRfR1xmn80td4DTLWQsCdQcWd47yIbEpu3l_VayLUXbmubyHB7YHR.ZIXRvWp5fOBzFd")
		    .multiPart("client_secret", "291A0A90C694DB1F0FA432A4AFEB410B93AC83E40F47FF962FB99C554EDF7F3C")
		
		.when()
		.post("services/oauth2/token").then()
		.assertThat().statusCode(200)
		.extract().response().asString();
		   
		   JsonPath js = new JsonPath(response);
		   String AccessToken = js.getString("access_token");
		   return AccessToken;
		
	}
		
	
	@Test
	public void createAccount() {
		// Eclipse --> Windows --> Preferences --> Editor --> Content Assist --> Typing --> Check 'Escape text when pasting into a string literal
		RestAssured.baseURI = Instance_url;
		DemoPostRequest sfdc = new DemoPostRequest();
		given().header("Content-type","application/json").header("Authorization","Bearer " +sfdc.getAccessToken())
		.body(sfobjectdata.getAccountData())
		.when()
		.post("services/data/v44.0/sobjects/Account")
		.then().log().all();		
		
		
		// given().queryParam("", "").header("","").header("","").body("").when().post().then().log().all();
		//String response = given().queryParam("", "").header("","").header("","").body("").when().get().then().log().all().extract().response().asString();
		
	}
	
	@Test
	public void getStaticJsonData() throws IOException {
		
		byte[] biteformat = Files.readAllBytes(Path.of(System.getProperty("user.dir") +"/src/main/resources/testdata/sfdc/sfdctestdata.json" ));
		
		
		given().header("","").body("").when().put("Specify URI").then().extract().response().asString();
		given().header("","").body("").when().patch("").then().extract().response().asString();
		
		
		String jout = new String(Files.readAllBytes(Path.of(System.getProperty("user.dir") +"/src/main/resources/testdata/sfdc/SampleJsonFile.json" )));
	
	String jsonout = given().header("","").body(biteformat).when().post("").then().extract().response().asString();
	
	System.out.println("JSON ** OUT :" +jout);
		
	}
	
	


}
