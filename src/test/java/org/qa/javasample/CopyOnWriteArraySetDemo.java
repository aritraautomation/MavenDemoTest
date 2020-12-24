package org.qa.javasample;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetDemo {

	public static void main(String[] args) {
		CopyOnWriteArraySet cowas = new CopyOnWriteArraySet();
		
		cowas.add("M");
		cowas.add("N");
		cowas.add("O");
		
		System.out.println(cowas);
		
		Iterator itr = cowas.iterator();
		
		cowas.add("P");
		
		
		while(itr.hasNext()){
			String s = (String)itr.next();
			System.out.println(s);
		}
		
		System.out.println(cowas);
		
	}

}
