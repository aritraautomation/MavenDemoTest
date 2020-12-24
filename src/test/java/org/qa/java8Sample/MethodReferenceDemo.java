package org.qa.java8Sample;

public class MethodReferenceDemo {
	
	public void m1(){
		for(int i=0;i<10;i++){
			System.out.println("Child Thread");
		}
	}

	public static void main(String[] args) {
		MethodReferenceDemo mf = new MethodReferenceDemo();
		Runnable r = mf::m1;
		Thread t =new Thread(r);
		t.start();
		
		for(int i=0;i<10;i++){
			System.out.println("Main Thread");
		}

	}

}
