package org.qa.seleniumDemo;

import org.apache.poi.util.SystemOutLogger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderIndices {
	
	@Test(dataProvider="DataContainer")
	public void getTestData(String FirstName,String LastName,int RollNumber){
		System.out.println("First Name : " + FirstName + "," + "Last Name : " + 
	LastName +  "," + "Roll Number : " + RollNumber);
		
	}
	
	
	//@DataProvider(name="DataContainer",indices={1,2})
	@DataProvider(name="DataContainer",parallel=true)
	public Object[][] getData(){
		
		Object[][] data = new Object[4][3];
		
		data[0][0]="Peter";
		data[0][1]="England";
		data[0][2]=123;
		
		data[1][0]="Harry";
		data[1][1]="English";
		data[1][2]=193;
		
		data[2][0]="Jammu";
		data[2][1]="Tier";
		data[2][2]=323;
		
		data[3][0]="Spike";
		data[3][1]="Hall";
		data[3][2]=823;
		
		return data;
	}

}
