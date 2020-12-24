package org.qa.java8Sample;

interface I{
	public void m1();
	public void m2();
	default void m3()
	{
		System.out.println("m3 method");
		//return 10;
	}
	
}
class DefaultMethodsDemo implements I {
	
	@Override
	public void m1() {
		System.out.println("m1 method");		
	}

	@Override
	public void m2() {
		System.out.println("m2 method");
		
	}
	/*public void m3(){
		System.out.println("m3 overriding method");
	}*/
	
	public static void main(String[] args){
		DefaultMethodsDemo d = new DefaultMethodsDemo();
		d.m1();
		d.m2();
		d.m3();
	}  	
}
