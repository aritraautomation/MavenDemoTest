package org.qa.java8Sample;

interface interf{
	public void add(int a, int b);
}
class MethodReferenceDemo1 {

	public static void m1(int x,int y){
		System.out.println("Sum is : " + (x+y));
	}
	
	public static void main(String[] args) {
		interf i = MethodReferenceDemo1::m1;
		i.add(10, 20);
		
		}

	

}
