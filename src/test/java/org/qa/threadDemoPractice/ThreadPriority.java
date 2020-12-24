package org.qa.threadDemoPractice;

public class ThreadPriority {

	public static void main(String[] args) {
		
		System.out.println("Main Thread Priority is : " + Thread.currentThread().getPriority());
		
		MyThread t = new MyThread();
		
		System.out.println("Initial priority of Child Thread : " + t.getPriority());
		
		//t.start();
		
		t.setPriority(10);
		
		System.out.println("After Changing the Child Thread Priority : " + t.getPriority());
		
		t.start();
		
		for(int i=0;i<10;i++){
			System.out.println("Main Thread");
		}
		

	}

}

