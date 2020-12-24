package org.qa.demo;

import java.util.ArrayList;
import java.util.function.Predicate;

//Print Name and Salary of Employees whose salary>3000 using Predicate***

class Employee1{
	
	String name;
	int salary;
	
	Employee1(String name, int salary){
		this.name = name;
		this.salary = salary;
	}
	
	/*public String toString(){
		return name + " " + salary;
	}*/
}

public class Test5 {

	public static void main(String[] args) {
		
		ArrayList<Employee1> al = new ArrayList<Employee1>();
		
		al.add(new Employee1("Harry",4000));
		al.add(new Employee1("Peter",3000));
		al.add(new Employee1("Aryan",5000));
		al.add(new Employee1("Sourav",1000));
		
		Predicate<Employee1> p = e->e.salary>3000;
		
		for(Employee1 e1:al){
			if(p.test(e1)){
				System.out.println(e1.name + " " + e1.salary);
			}
		}
		

	}

}
