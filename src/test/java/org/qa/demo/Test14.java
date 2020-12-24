package org.qa.demo;

import java.util.ArrayList;
import java.util.function.BiFunction;

class EmpTest{
	int eno;
	String ename;
	
	EmpTest(int eno,String ename){
		this.eno = eno;
		this.ename = ename;
	}
	
}

public class Test14 {

	public static void main(String[] args) {
		ArrayList<EmpTest> al =new ArrayList<EmpTest>();
		
		BiFunction<Integer,String,EmpTest> f = (eno,ename)->new EmpTest(eno,ename);
		
		al.add(f.apply(100, "Durga"));
		al.add(f.apply(62, "Rickey"));
		al.add(f.apply(46, "Vickey"));
		al.add(f.apply(32, "Bunny"));
		al.add(f.apply(55, "Sunny"));
		
		for(EmpTest e:al){
			System.out.println("Employee Number: " + e.eno);
			System.out.println("Employee Name: " + e.ename);
			System.out.println();
		}
	}

}
