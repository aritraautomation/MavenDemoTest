package org.qa.seleniumDemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;

public class ReadDataFromCSVFile {	
	
	public static ArrayList<Object> getDataFromCSVFile() throws IOException{
	
	//public static void main(String[] args) throws IOException{
		
		ArrayList<Object> getData = new ArrayList<Object>();
		
		 FileReader reader;
		 CSVReader csvreader;
		
	reader = new FileReader("/Automation/MavenDemoTests/UserDetails.csv");
	csvreader = new CSVReader(reader);
	
	//String[] cell;
	
	List<String[]> list = csvreader.readAll();
	System.out.println(list.size());
	
	for(int i=1;i<list.size();i++){
		String emailAddress =list.get(i)[0];
		System.out.println(emailAddress);
		
		String password =list.get(i)[1];
		System.out.println(password);
		
		Object obj[]={emailAddress,password};
		getData.add(obj);		
	}
	return getData;
  }
}	
		
	
	
	/*while((cell = csvreader.readNext())!=null){
		System.out.println(cell);
		
		for(int i=0;i<=cell.length;i++){
			
			String emailAddress = cell[i];			
			System.out.println(emailAddress);
			
			String password = cell[i+1];
			System.out.println(password);		*/


