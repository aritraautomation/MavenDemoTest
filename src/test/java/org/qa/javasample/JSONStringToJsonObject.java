package org.qa.javasample;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class JSONStringToJsonObject {

	public static void main(String[] args) {
		//Using JsonParser
		
		String json = "{ \"name\": \"Baeldung\", \"java\": true }";
		JsonObject jsonObject = new JsonParser().parse(json).getAsJsonObject();
		System.out.println(jsonObject);
	}

}
