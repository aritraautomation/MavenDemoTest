package org.qa.javasample;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {

	public static void main(String[] args) {
		CopyOnWriteArrayList cowal = new CopyOnWriteArrayList();
		
		cowal.add("X");
		cowal.add("Y");
		cowal.add("Z");
		
		System.out.println(cowal);
		
		Iterator itr = cowal.iterator();
		
		cowal.add("V");
		
		System.out.println(cowal.addIfAbsent("T"));
		
		System.out.println(cowal.addIfAbsent("X"));
		
		//cowal.addAllAbsent(cowal);
		//cowal.clone();
		
		System.out.println(cowal);
		
		while(itr.hasNext()){
			String s= (String)itr.next();
			//itr.remove();
			System.out.println(s);
			
		}
		System.out.println(cowal);
		
		
		
	}

}
