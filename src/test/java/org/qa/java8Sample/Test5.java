package org.qa.java8Sample;

interface Interfs{
	public static void m1(){
		System.out.println("static method m1 in Interface");		
	}
	
	default void m3(){
		System.out.println("default method m3 in Interface");
	}
	
	public static void m2(){
		System.out.println("static method m2 in Interface");		
	}
}

public class Test5 implements Interfs {
	public static void m1(){
		System.out.println("static method m1 in class");		
	}
	public static void main(String[] args) {
		Interfs.m1(); //only way
		//Interfs.m3();
		Test5.m1();
		
		//m1();
		//Test5.m1();
		Test5 t = new Test5();
		t.m1();
		t.m3();
	}

}
