package org.qa.demo;

public class Test17 {
	
	public static void m1(){
		for(int i=0;i<10;i++){
			System.out.println("child thread");
		}
	}

	public static void main(String[] args) {
		Runnable r = Test17::m1;
		Thread t = new Thread(r);
		t.start();
		
		for(int i=0;i<10;i++){
			System.out.println("main thread");
		}
		
	}

}
