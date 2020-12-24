package org.qa.javasample;

import groovy.json.JsonBuilder;
import groovy.json.JsonSlurper;

public class JsonToMapconvertion {

	public static void main(String[] args) {
		
		JsonSlurper json = new JsonSlurper();
	
		System.out.println(json.parseText("[{\"NewsID\":3,\"NewsCompId\":2,\"CompanyId\":1,\"CompanyLegalName\":\"demo 1\"},{\"NewsID\":97,\"NewsCompId\":98,\"CompanyId\":99,\"CompanyLegalName\":\"demo 2\"}]"));
		
		JsonBuilder builder = new JsonBuilder(json);
		
		System.out.println (builder.toPrettyString());
	}

}
