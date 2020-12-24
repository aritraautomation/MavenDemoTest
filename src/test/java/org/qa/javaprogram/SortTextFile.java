package org.qa.javaprogram;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

//How to sort a text file in java?

public class SortTextFile {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		ArrayList<String> al = new ArrayList<String>();
		
		try {
			br = new BufferedReader(new FileReader("/Automation/MavenDemoTests/input.txt"));
			String currentLine = br.readLine();
			
			while(currentLine!=null){
				al.add(currentLine);
				currentLine = br.readLine();
			}
			
			Collections.sort(al);
			
			bw = new BufferedWriter(new FileWriter("/Automation/MavenDemoTests/output.txt"));
			
			for(String line:al){
				bw.write(line);
				bw.newLine();
			}			 
			
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		finally
		{
			if(br!=null){
				br.close();
			}
			if(bw!=null){
				bw.close();
			}
		}
	}

}
