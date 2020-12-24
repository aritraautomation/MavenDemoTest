package org.qa.java8Sample;

import org.apache.poi.util.SystemOutLogger;

interface A{
	default void m1()
	{
		System.out.println("interface A");
	}
}

interface B{
	default void m1()
	{
		System.out.println("interface B");
	}
}

public class Test4 implements A,B{
	
	public static void main(String[] args){
		Test4 t = new Test4();
		t.m1();
	
	
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		A.super.m1();
		A.super.m1();
		B.super.m1();
		System.out.println("called");
	}

}
