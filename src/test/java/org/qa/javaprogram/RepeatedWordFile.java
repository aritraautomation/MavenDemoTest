package org.qa.javaprogram;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;

public class RepeatedWordFile {

	public static void main(String[] args) throws IOException {
		
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		BufferedReader reader = null;
		
		try {
			 reader = new BufferedReader(new FileReader("/Automation"
					+ "/MavenDemoTests/testFile.txt"));
			
			String currentLine = reader.readLine();
			
			while(currentLine!=null){
				String[] str = currentLine.toLowerCase().split(" ");
				
				for(String st:str){
					if(map.containsKey(st)){
						map.put(st, map.get(st)+1);						
					}else{
						map.put(st, 1);
					}
				}
				currentLine=reader.readLine();
			}
			
				Set<String> keys = map.keySet();				
				
				//Repeated Word in a Text File:
				/*for(String key:keys){
					if(map.get(key)>1){
						String repeatedWord = key;
						int noOfOccurance = map.get(key);
						System.out.println("Repeated Word : " + repeatedWord);
						System.out.println("No of occurance : "  + noOfOccurance);
					}
				}	*/	
				
				//Most Repeated Word in a Text File:
				String mostRepeatedWord =null;
				int count =0;
				for(String key:keys){
					if(map.get(key)>count){
					    mostRepeatedWord = key;
						count = map.get(key); 
					}
				}
				System.out.println("Most Repeated Word : " + mostRepeatedWord);
				System.out.println("No of occurance : "  + count);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		finally
		{
			try{
				reader.close();
			}catch(FileNotFoundException e){
				e.printStackTrace();
			}
		}
	}
		
}
