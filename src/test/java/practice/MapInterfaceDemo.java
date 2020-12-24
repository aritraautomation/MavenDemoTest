package practice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapInterfaceDemo {

	public static void main(String[] args) {
		
		HashMap m = new HashMap();
		
		m.put("81", "AA");
		m.put("6", "JB");
		m.put("9", "GA");
		m.put("10", "PG1");
		
		System.out.println(m); //{81=AA,6=JB,9=GA,10=PG1}
		
		System.out.println("Value of 9 : " + m.get("9"));//GA
		
		Set s = m.keySet();
		System.out.println("Set Value of keySet: " + s);//[81,6,9,10] 
		
		Collection c = m.values();
		System.out.println("Collection values : " + c); //[JB, AA, GA, PG1]
		
		Set eset = m.entrySet();
		System.out.println("Set Value of entrySet: " + eset);//[81=AA,6=JB,9=GA,10=PG1]
		
		Iterator itr = eset.iterator();
		
		while(itr.hasNext()){
			Map.Entry me =(Map.Entry)itr.next();
			
			System.out.println("Keys : " + me.getKey() + " and Values : " + me.getValue());
		}
		
		m.remove("6");
		System.out.println("Map Elements after remove : " + m);//{81=AA,9=GA,10=PG1}
		
		
	}

}
