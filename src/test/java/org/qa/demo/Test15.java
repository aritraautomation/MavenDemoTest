package org.qa.demo;

import java.util.ArrayList;
import java.util.function.BiConsumer;

class EmpDetails{
	String empName;
	double Salary;
	
	EmpDetails(String empName,double Salary){
		this.empName = empName;
		this.Salary = Salary;		
	}
}

public class Test15 {

	public static void main(String[] args) {
		ArrayList<EmpDetails> al =new ArrayList<EmpDetails>();
		populate(al);
		
		BiConsumer<EmpDetails,Double> c = (e,d)->e.Salary = e.Salary + d;
		
		for(EmpDetails e:al){
			c.accept(e,500.00);
		}
		
		for(EmpDetails e:al){
			System.out.println("Employee name : " + e.empName);
			System.out.println("Employee's salary : " + e.Salary);
			System.out.println();
		}
		
	}
	
	public static void populate(ArrayList<EmpDetails> al){
		al.add(new EmpDetails("Durga",1000));
		al.add(new EmpDetails("Sunny",2000));
		al.add(new EmpDetails("Bunny",3000));
		al.add(new EmpDetails("Runny",4000));
	}

}

	