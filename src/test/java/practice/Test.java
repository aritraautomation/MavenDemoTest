package practice;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;


public class Test {

	public static void main(String[] args)  {
		
		ArrayList al = new ArrayList(Arrays.asList(10,20,"td",90,"tr",20));
		
		System.out.println(al);
		
		int indexof20 = al.indexOf(20);
		System.out.println("1st occurance of 20 : " +  indexof20);
		
		al.add(60);
		
		System.out.println(al);
		
		al.set(1, "vb");
		
		System.out.println(al);
		
		al.remove(3);
		System.out.println(al);
		
		ArrayList kl = new ArrayList(Arrays.asList(100,200,300,20));
		
		//al.addAll(kl);
		
		//System.out.println(al);
		
		System.out.println(al.equals(kl));
		
		//Reverse of a ArrayList:
		Collections.reverse(al);
		System.out.println("Reverse of Array List : " + al);
		
		//
		ArrayList al3 = new ArrayList(Arrays.asList(100,30,-10,22,-30,3,100,22));
		System.out.println(al3);
		Set st = new LinkedHashSet(al3);
		
		
		System.out.println("Distinct Elements : " +  st);
		
		//convert array to arrayList:
		
		 String[] geeks = {"Rahul", "Utkarsh", 
                 "Shubham", "Neelam"};
		
		Integer arr11[] = {10,20,30};
		
		List al12 = Arrays.asList(arr11);
		System.out.println(al12);
		
		//convert arrayList to array:
		
		ArrayList lp = new ArrayList(Arrays.asList(33,400,11,202));
		
		 Object[] obj = lp.toArray();
		 
		 for(Object ob:obj){
			 System.out.print(ob + " ");
		 }
		 
		lp.ensureCapacity(55);
		 
		 
		 lp.trimToSize();
		
		 System.out.println(lp);
		 
		Iterator itr = lp.iterator();
		
		while(itr.hasNext()){
			Integer n = (Integer)itr.next();
			if(n%10==0){
				System.out.println(n);
			}
		}
		 
		 
		 
		}
		

		
	}

