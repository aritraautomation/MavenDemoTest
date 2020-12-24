package org.qa.javasample;

import java.util.HashSet;
import java.util.Set;

public class ClientTest {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Harry", 25);
		Employee e2 = new Employee("Harry",25);
		
		
		Set<Employee> emp = new HashSet<Employee>();
		
		emp.add(e1);
		emp.add(e2);
		
		System.out.println(e1);
		System.out.println(e2);
		
		System.out.println("hashCode of e1-->" + e1.hashCode());
		System.out.println("hashCode of e2-->" + e2.hashCode());
		
		System.out.println("Both Employee are same ? -->" + e1.equals(e2));
	
		System.out.println("Size of the Employee in HashSet-->" + emp.size());
	}

}
