package org.qa.demo;

import java.util.ArrayList;
import java.util.Collections;

class Employee {
	
	String name;
	int rollNo;
	
	public Employee(String name,int rollNo){
		this.name = name;
		this.rollNo = rollNo;		
	}
	public String toString(){
		return name + " : " + rollNo;
	}
}	
	
class MyEmployee{
	public static void main(String[] args) {
		
		ArrayList<Employee> al = new ArrayList<Employee>();		
		
		al.add(new Employee("Shyam", 30));
		al.add(new Employee("Patel", 10));
		al.add(new Employee("Hari", 50));
		al.add(new Employee("Peter", 40));
		
		//integer Ascending order:
		//Collections.sort(al,(e1,e2)->(e1.rollNo<e2.rollNo)?-1:(e1.rollNo>e2.rollNo)?1:0);
		
		//Alphabetical Ascending order:
		//Collections.sort(al,(e1,e2)->(e1.name).compareTo(e2.name));
		
		//integer Descending order:
		//Collections.sort(al,(e1,e2)->(e1.rollNo>e2.rollNo)?-1:(e1.rollNo<e2.rollNo)?1:0);
		
		//Alphabetical Descending order:
		Collections.sort(al,(e1,e2)->(e2.name).compareTo(e1.name));
		
		System.out.println(al);
		
		
	}
}
	


