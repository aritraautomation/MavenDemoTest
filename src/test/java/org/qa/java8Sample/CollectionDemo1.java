package org.qa.java8Sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyComparator implements Comparator<Integer>{
	
	public int compare(Integer I1, Integer I2) {
		
		return (I1<I2)?-1:(I1>I2)?1:0;
		
		/*if(I1<I2){
			return -1;
		}
		else if(I1>I2){
			return +1;
		}
		else{
			return 0;
		}*/
	}	
}

public class CollectionDemo1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> l = new ArrayList<Integer>();
		
		l.add(20);
		l.add(2);
		l.add(22);
		l.add(30);
		l.add(25);
		l.add(10);
		
		System.out.println("Before sorting : " + l);
		
		Collections.sort(l, new MyComparator());
		
		System.out.println("After sorting as Ascending Order : " + l);

	}

}
