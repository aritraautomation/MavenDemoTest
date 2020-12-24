package org.qa.demo;

public class MyRunnable {

	public static void main(String[] args) {
		
		Runnable r = ()->{
			for(int i=0;i<10;i++){
				System.out.println("Child Thread");
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		
		for(int j=0;j<10;j++){
			System.out.println("Main Thread");
		}
		
	}

}
