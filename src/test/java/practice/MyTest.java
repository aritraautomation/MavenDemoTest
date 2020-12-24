package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class MyTest {

	public static void main(String[] args) {
		CopyOnWriteArrayList al = new CopyOnWriteArrayList();
		
		al.add("ST");
		al.add("BT");
		al.add("vT");
		
		
		Iterator itr = al.iterator();
		
		al.add("FT");
		
		while(itr.hasNext()){
			String str = (String)itr.next();
			System.out.println(str);
		}
		System.out.println(al);
		
	}

}
