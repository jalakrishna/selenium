package com.selenium.sfdcapi;

import com.sforce.soap.partner.PartnerConnection;
import com.sforce.soap.partner.SaveResult;
import com.sforce.soap.partner.sobject.SObject;
import com.sforce.ws.ConnectionException;
import com.sforce.ws.ConnectorConfig;

public class SampletestClass {

	public static void main(String[] args) throws ConnectionException {
		
		ConnectorConfig config = new ConnectorConfig();
		// https://login.salesforce.com/services/oauth2/token
		//config.setAuthEndpoint("https://iheartmedia-dev-ed.my.salesforce.com/services/Soap/u/38.0/");
		config.setAuthEndpoint("https://login.salesforce.com/services/Soap/u/38.0/");
		config.setUsername("jalakrishna@edata.com");
		config.setPassword("Sales1238eBpJpcTHk4Psa272dqB1q7Ry");
		PartnerConnection connection = new PartnerConnection(config);
		System.out.println(connection);
		
		SObject lead = new SObject();
		SObject[] leads = new SObject[1];
		lead.setType("Lead");
		lead.setField("LastName", "Online Lead");
		lead.setField("company", "prospect");
		leads[0] = lead;
		System.out.println(leads[0]);
		
		
		
		System.out.println(lead);
		
		SaveResult[] result = connection.create(leads);
		System.out.println(result);
		System.out.println(result[0]);
		//System.out.println(result[1]);
		//System.out.println(result[2]);
		
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
		
		
		

	}
	
	
	public void sfobjects() throws ConnectionException {
		
		ConnectorConfig config = new ConnectorConfig();
		config.setAuthEndpoint("");
		config.setUsername("");
		config.setPassword("");
		PartnerConnection connection = new PartnerConnection(config);
		
		SObject lead = new SObject();
		SObject[] leads = new SObject[1];
		lead.setType("");
		lead.setField("", "");
		SaveResult[] results = connection.create(leads);
		leads[0] = lead;
		for(SObject s: leads) {
			
			s.getId();
			
		}
		
		
		
		
		
		
	}

}

