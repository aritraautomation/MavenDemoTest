package org.qa.java8Sample;

public class SumAllDigits {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i = 0;i<=100;i++){
			sum=sum+i;			
		}
		System.out.println(sum);
		
		System.out.println(sum(3));
	}
	
	static int sum(int num){
		if(num!=0){
			return num+sum(num-1);
		}
		else {
			return num;
		}
	}

}
