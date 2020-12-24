package org.qa.seleniumDemo;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJsonFile {
	
	static ArrayList<Object> getData = new ArrayList<Object>();
	
	static FileReader reader; 
	
	public static ArrayList<Object> readDataFromJSONFile() throws IOException, ParseException{

	JSONParser jsonparser = new JSONParser();
	
	FileReader reader = new FileReader("/Automation//MavenDemoTests/userdetails.json");
		
	Object object = jsonparser.parse(reader);
	JSONObject jsonObj = (JSONObject)object;
	
	JSONArray jsonarray = (JSONArray)jsonObj.get("userlogins");
	
	for(int i=0;i<jsonarray.size();i++){
		
		System.out.println("**************");
		JSONObject jsonObject = (JSONObject)jsonarray.get(i);
		
		String emailAddress = (String)jsonObject.get("emailAddress");
		System.out.println("Password:" + emailAddress);
		
		String password = (String)jsonObject.get("password");
		System.out.println("Password:" + password);
		
		Object obj[] = {emailAddress,password};
		getData.add(obj);		
	}	
	return getData;
  }
}
