package org.qa.seleniumDemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDemo {
	
	@Test(dataProvider="getData")
		public void getTestData(String xyz, String mns){
		System.out.println(xyz + mns);
	}
	
	
	@DataProvider
	public Object[][] getData(){
		Object data[][] ={
				{"dhd","ddsdsd"},
				{"d33hd","ddssdsddsd"},
				{"dswhd","ddsd22sd"},
				{"ddsdhd","ddsdsdssd"},
				
			};
		return data;
	}

}
