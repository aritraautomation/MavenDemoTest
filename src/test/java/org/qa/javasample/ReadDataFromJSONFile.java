package org.qa.javasample;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadDataFromJSONFile {

	public static void main(String[] args) throws IOException, ParseException {
		JSONParser jsonparse = new JSONParser();
		
		FileReader reader = new FileReader(".\\jsonFile\\employee.json");
		
		Object object = jsonparse.parse(reader);
		
		JSONObject jsonObj =(JSONObject)object;
		
		//System.out.println(jsonObj.get("firstName"));
		String fName = (String)jsonObj.get("firstName");
		
		String lName = (String)jsonObj.get("lastName");
		
		System.out.println("First Name is : " + fName);
		System.out.println("Last Name is : " + lName);
		
		JSONArray jsonArr =(JSONArray)jsonObj.get("address");
		
		for(int i=0;i<jsonArr.size();i++){
			JSONObject address =(JSONObject)jsonArr.get(i);
			
			String street =(String)address.get("street");
			String city =(String)address.get("city");
			String state =(String)address.get("state");
			
			System.out.println("Address of " + i+ ":");
			System.out.println("Street is " + street);
			System.out.println("Street is " + city);
			System.out.println("Street is " + state);
		}		
		
	}

}
