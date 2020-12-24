package org.qa.javasample;

public class Test3 {

	public int a=46;
	
	
	public void m2(Test3 m1){
		m1.a=m1.a+17;
		System.out.println(m1.a);		
	}
	public static void main(String args[]) {
		System.out.println("Static method");
		Test3 t3 = new Test3();
		
		t3.m2(t3);//63
		System.out.println(t3.a);	//63
}
}
