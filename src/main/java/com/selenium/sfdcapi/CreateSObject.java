package com.selenium.sfdcapi;

import com.sforce.soap.partner.sobject.SObject;

public class CreateSObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public SObject getAccountData(String recordTypeName) {
		
		SObject[] accounts = new SObject[1];
		
		SObject account = new SObject();
		account.setField("Name", "Test Account Name");
		account.setField("RecordTypeID", "");
		accounts[0] = account;
		return account;
		
		
		
	}
	

}
