package org.qa.demo;

interface AB{
	public static void m1(){
		System.out.println("Static methods in interface AB");
	}
}

interface CD{
	public static void m1(){
		System.out.println("Static methods in interface CD");
	}
	public static void m2(){
		System.out.println("Static methods in interface CD");
	}
}

interface MN{
	public static void main(String[] args){
		System.out.println("Main Method");
	}
}

public class StaticMethodsInterface implements AB,CD,MN{

	public static void main(String[] args) {
		
		//MN.main(args);
		CD.m2();

	}
	
}



