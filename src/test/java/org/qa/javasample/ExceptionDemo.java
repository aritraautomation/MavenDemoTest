package org.qa.javasample;

import java.util.Scanner;

public class ExceptionDemo {
	
	//ExceptionInInitializerError caused by ArithmeticException
		/*static int z = 10/0;*/
		
	//ExceptionInInitializerError caused by NullPointerException
		/*static{
			String s4 = null;
			System.out.println(s4.length());
			}*/
	/*public static void m1(){		
		m2();
	}
	
	public static void m2(){
		m1();
	}*/

	/*static ArithmeticException e = new ArithmeticException();*/
	
	/*static ArithmeticException e;*/
	
	public static void main(String[] args) {
		
		//ArithmeticException
		/*throw e;*/
		
		//NullPointerException
		/*throw e;*/
		
		//CE:unreachable statement
		/*throw new ArithmeticException("division by zero");
		System.out.println("hello");*/
		
		//CE:incompatible types when class not extending Throwable types
		/*throw new ExceptionDemo();*/
		
		//StackOverflowError
			/*m1();*/
		/*Scanner sc = new Scanner (System.in);
		System.out.print("Enter ur age "); 
		 
		int value = sc.nextInt();
		assert value>=18:"Not Valid";
		
		System.out.println(value);
		*/
		//sc.close();
		
		
		
		//ClassCastException
		/*Object o = new Object();
		String s = (String)o;*/		
		
		Object o1 = new String("test1");
		String s1 = (String)o1;
		System.out.println(s1);
		
		String s2 = new String("test2");
		Object o2 = (Object)s2;
		System.out.println(o2);
		
		//NumberFormatException
		/*int x= Integer.parseInt("ten");
		System.out.println(x);*/
		
		//IllegalArgumentException
		/*Thread t =new Thread();
		t.setPriority(12);*/
		
		//NullPointerException
		/*String s3 = null;
		System.out.println(s3.length());*/
		
		//ArrayIndexOutOfBoundException
		/*int x[] = new int[4];
		System.out.println(x[5]);*/
		
		//CE:unreachable statement
		/*throw new ArithmeticException();
		System.out.println("Hello");*/
		
	
	}

}
