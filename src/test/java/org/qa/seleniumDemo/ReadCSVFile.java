package org.qa.seleniumDemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;

public class ReadCSVFile {

	public static void main(String[] args) throws IOException {
		
		FileReader reader = new FileReader("/Automation/MavenDemoTests/UserDetails.csv");
		CSVReader csvreader = new CSVReader(reader);
		
		String[] nextRecord;
		
		while((nextRecord=csvreader.readNext())!=null){
			for(String cell:nextRecord){
				System.out.print(cell + "\t");
			}
			System.out.println();
		}

	}

}
