package org.qa.javasample;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer,String> mp =new HashMap<Integer,String>();
		
		mp.put(101, "Ravi");
		mp.put(102, "Nandan");
		mp.put(103, "Raja");
		mp.put(101, "AS");
		
		System.out.println(mp);
		
		System.out.println(mp.get(101));
		
		//Object rm = mp.remove(102);
		//System.out.println(rm);
		
		System.out.println(mp);
		
				
		mp.containsKey(103);
		if (mp.containsValue("Ravi")==false){
			mp.put(104, "Ravi");
			System.out.println(mp);
		}else{
			mp.remove(101);
		}
		
		System.out.println(mp.size());
		
		Set s = mp.keySet();		
		System.out.println(s);
		
		Collection c = mp.values();
		System.out.println(c);
		
		Set s1 = mp.entrySet();
		System.out.println(s1);
		
		Iterator itr = s1.iterator();
		
		while(itr.hasNext()){
			Map.Entry m1 = (Map.Entry)itr.next();
			//System.out.println(m1);
			System.out.println(m1.getKey()+"....." + m1.getValue());
		}
		
		//Set<Map.Entry<Integer, String>> st=mp.entrySet();
		
	}

}
