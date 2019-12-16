package org.qa.javasample;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {

	public static void main(String[] args) {
		IdentityHashMap m = new IdentityHashMap();
		
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		//JVM will use == comparator i.e. reference comparison for duplicate Keys comparison if we use IdentityHashMap
		//and use.equals methods i.e.for content comparison if we use normal HashMap
		m.put(i1, "Ravi");
		m.put(i2, "Pavan");
		
		System.out.println(m);
	}

}
