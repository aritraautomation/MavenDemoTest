package org.qa.javasample;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {

	public static void main(String[] args) {
		
		String names[] = {"Java","JavaScript","Ruby","Java"};
		
		for (int i=0;i<names.length;i++){
			for (int j=i+1;j<names.length;j++){
				if (names[i].equals(names[j])){
					System.out.println("Duplicate Element by Set is : " + names[i]);
				}
			}
		}
	

	
	//Using Set

	Set<String> store =new HashSet<String>();

	for(String name:names){
		
		if (store.add(name)==false){
			System.out.println("Duplicate Element is:: " + name);
		}
		
	}
}
}	






