package org.qa.javasample;

import java.util.HashMap;

public class CollisionMap {

	public static void main(String[] args) {
		
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		HashMap<Integer,Integer> hm1 = new HashMap<Integer,Integer>();

		
		hm.put(10,17);
		hm1.put(10, 20);
		
		System.out.println(hm.size());
		
		System.out.println(hm.get(10));
		
		System.out.println(hm.hashCode());
	}

}
