package org.qa.javaprogram;

import java.io.FileWriter;
import java.io.IOException;

public class AppendTextFile {

	
	//Append text to an existing file using FileWriter
	public static void main(String[] args) {
		
		//String path = System.getProperty("user.dir")+ "/MavenDemoTests/testData.txt";
		String path = "/Automation/MavenDemoTests/testData.txt";
		try {
			FileWriter fw = new FileWriter(path,true);
			fw.write("Aritra");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
