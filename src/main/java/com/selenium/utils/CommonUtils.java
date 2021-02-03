package com.selenium.utils;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.fasterxml.jackson.core.JsonParser;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class CommonUtils {

	public static JSONObject getJsonData(String filename, String filepath) {
		
		String userdir = System.getProperty("user.dir");
		String datafilepath = userdir + "/" +filepath;
		JSONObject jobject = null;
		
		try {
			FileReader filereader = new FileReader(datafilepath+filename);
			JSONParser jsonparser = new JSONParser();
			JSONObject jsonobject = (JSONObject) jsonparser.parse(filereader);
			jobject = jsonobject;
			//System.out.println(jsonobject);
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return jobject;
			
	}
	

	
	
	
}