package org.qa.javasample;

import com.google.gson.Gson;

public class EmployeeJSON {
	
	private String empName;
	private int empID;
	private int age;
	
	public EmployeeJSON(String empName,int empID,int age){
		
		this.empName = empName;
		this.empID = empID;
		this.age = age;
	}
	
	public static void main(String[] args){
		
		Gson gson = new Gson();
		
		EmployeeJSON empJson = new EmployeeJSON("John",33,30);
		String json = gson.toJson(gson);
		
		System.out.println(json);
	}
	

}
