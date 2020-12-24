package org.qa.javasample;

class SingletonClassDemo {
	
	private static SingletonClassDemo t = new SingletonClassDemo();
	
	private SingletonClassDemo(){
	}
	
	public static SingletonClassDemo getSingletonClassDemo(){
		return t;
	}
	
	public static void main(String[] args){
		SingletonClassDemo t1 = SingletonClassDemo.getSingletonClassDemo();
		System.out.println(t1);
		SingletonClassDemo t2 = SingletonClassDemo.getSingletonClassDemo();
		System.out.println(t2);
		SingletonClassDemo t3 = SingletonClassDemo.getSingletonClassDemo();
		System.out.println(t3);
	}

}
