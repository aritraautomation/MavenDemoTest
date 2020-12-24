package org.qa.javaprogram;

public class SumUsingRecursive {

	public static void main(String[] args) {
		System.out.println(sum(10));
		
		System.out.println(sum1(5,10));

	}
	
	static int sum(int k){
		if(k>0){
			return k + sum(k-1);
		}
		else{
			return 0;
		}
	}
	
	static int sum1(int start, int end){
		if(end>start){
			return end + sum1(start,end-1);
		}
		else{
			return end;
		}
	}

}
