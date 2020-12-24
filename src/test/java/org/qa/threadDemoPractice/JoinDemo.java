package org.qa.threadDemoPractice;

class MyThreadDemo1 extends Thread{
	static Thread mt;
	public void run(){
		/*try{
			Thread.sleep(2000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}*/
		
		try{
			mt.join();//child thread waits until main thread completes
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		for(int i=0;i<10;i++){
			System.out.println("Child Thread");
		}
	}
}

class JoinDemo {

	public static void main(String[] args) throws InterruptedException {
		MyThreadDemo1.mt = Thread.currentThread();
		
		MyThreadDemo1 t = new MyThreadDemo1();		
		t.start();
		//t.join();//main thread waits until child thread completes 
		//t.join(10000);
		for(int i=0;i<10;i++){
			System.out.println("Main Thread");
		}		
	}
}
