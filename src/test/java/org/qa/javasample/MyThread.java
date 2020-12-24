package org.qa.javasample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class MyThread extends Thread{
	
	public static ConcurrentHashMap hm = new ConcurrentHashMap();
	
	public void run(){
		System.out.println("Child thread updating");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		hm.put(3, "c");
	}
	

	public static void main(String[] args) throws InterruptedException {
		
		hm.put(1,"a");
		hm.put(2,"b");
		
		MyThread t = new MyThread();
		t.start();
		
		Set s = hm.entrySet();
		Iterator itr = s.iterator();
		
		while(itr.hasNext()){
			Map.Entry m =(Map.Entry)itr.next();
			Thread.sleep(3000);
			System.out.println("main thread is iterating");
		}
		System.out.println(hm);
		
		
		
		
	}

}
