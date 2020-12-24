package practice;

import java.util.ArrayList;
import java.util.Iterator;

public class ConcurrentModificationDemo extends Thread{
	
	static ArrayList al = new ArrayList();
	
	public void run(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Child Thread Updating");
		al.add("G");
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		al.add("A");
		al.add("D");
		al.add("E");
		al.add("F");
		
		ConcurrentModificationDemo t = new ConcurrentModificationDemo();
		t.start();
		
		Iterator itr = al.iterator();
		
		while(itr.hasNext()){
			String str = (String)itr.next();
			System.out.println("Main thread is iterating " + str);
			Thread.sleep(3000);
		}
		System.out.println(al);
	}

}
