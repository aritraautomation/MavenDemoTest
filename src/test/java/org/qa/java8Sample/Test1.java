package org.qa.java8Sample;

interface Interf10 {	
	public void m1();
}

class Test1 {

	public static void main(String[] args) {
			Interf10 i = ()-> System.out.println("Hello..Using Lambda Expression");
			i.m1();
	}

}
