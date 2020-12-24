package org.qa.javaprogram;

public class FactorialUsingRecursive {

	public static void main(String[] args) {
		
		System.out.println(multiplyNum(5));

	}
	
	static int multiplyNum(int num){
		if(num>=1){
			return num * multiplyNum(num - 1);
		}
		else{
			return 1;
		}
	}

}
