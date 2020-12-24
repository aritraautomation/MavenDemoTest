package org.qa.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

//Without using Lambda Expression:
/*class MyComaparator implements Comparator<Integer>{

	@Override
	public int compare(Integer I1, Integer I2) {
		if(I1<I2){
			return -1;
		}
		else if(I1>I2){
			return +1;
		}
		else{
			return 0;
		}		
	}
	
}*/

public class Test3 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList(Arrays.asList(10,20,15,19,0,20,30));
		//Collections.sort(al, new MyComaparator());
		
		//System.out.println(al);
		
		//Using Lambda Expression:
		
		//Comparator<Integer> c = (I1,I2)->(I1<I2)?-1:(I1>I2)?1:0;//Ascending order
		
		Comparator<Integer> c = (I1,I2)->(I1>I2)?-1:(I1<I2)?1:0;//Descending order
		
		Collections.sort(al,c);
		System.out.println(al);
		

	}

}

