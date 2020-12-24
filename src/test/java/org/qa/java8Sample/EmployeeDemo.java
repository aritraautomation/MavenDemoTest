package org.qa.java8Sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee{
	String empName;
	int empNo;
	
	Employee(String empName,int empNo){
		this.empName=empName;
		this.empNo=empNo;
	}
	
	public String toString(){
		return empNo + ":" + empName;
	}
}

public class EmployeeDemo {

	public static void main(String[] args) {
		
		/*Employee e = new Employee("Ryan",101);
		System.out.println(e);*/
		
		ArrayList<Employee> l = new ArrayList<Employee>();
		l.add(new Employee("Dyan",203));
		l.add(new Employee("Ayush",102));
		l.add(new Employee("Pyush",602));
		l.add(new Employee("Udemy",202));
		
		System.out.println(l);
		
		//Sorting as Ascending Order of EmpNumber

		/*Collections.sort(l,(e1,e2)->(e1.empNo<e2.empNo)?-1:(e1.empNo>e2.empNo)?1:0);
		System.out.println("After sorting as Ascending Order of EmpNo : " + l);*/
		
		//Sorting as Alphabetical Order of EmpName
		
		Collections.sort(l,(e1,e2)->e1.empName.compareTo(e2.empName));
		System.out.println("After sorting as Alphabetical Order of EmpName : " + l);
		
	}

}
