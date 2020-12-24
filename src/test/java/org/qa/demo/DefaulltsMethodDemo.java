package org.qa.demo;

interface A{
	default void m1(){
		System.out.println("Default Method in Interface A");
	}
	
	default void m2(){
		System.out.println("Default Method in Interface A");
	}
}

interface B{
	default void m1(){
		System.out.println("Default Method in Interface B");
	}
}

public class DefaulltsMethodDemo implements A,B{
	
	//Overriding
	public void m1(){
		System.out.println("Default Method in Class");
		B.super.m1();
		A.super.m2();
	}

	public static void main(String[] args) {
		
		DefaulltsMethodDemo d = new DefaulltsMethodDemo();
		d.m1();
		d.m2();

	}

}
