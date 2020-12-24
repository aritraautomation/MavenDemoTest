package org.java.streams;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.stream.*;

public class StreamDemo3 {

	public static void main(String[] args) {
		Map<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(2,"Harry");
		hm.put(1,"Peter");
		hm.put(5,"Sunny");
		hm.put(7,"Bunny");
		
		Set s1 = hm.entrySet();
		Iterator itr = s1.iterator();
		
		/*while(itr.hasNext()){
			Map.Entry it =(Map.Entry)itr.next();			
			System.out.println("[Key] : " + it.getKey() + " [Value] : " + it.getValue());
			}*/
		
		hm.forEach((key,value)->System.out.println(key + "=" + value));
		
		System.out.println("Using stream");
		
		hm.entrySet().stream().forEach(System.out::println);
		
		System.out.println("*************");
		
		hm.keySet().stream().forEach(System.out::println);
		hm.values().stream().forEach(System.out::println);
	}

}
