package org.qa.javaprogram;

public class PairOfElementsDemo {
	
	//find all pairs of elements in an array whose sum is equal to given number
	
	public static void main(String[] args) {
		int inputArr[] = new int[]{2,3,5,4,3,7,9};
		int input = 6;
		
		pairValue(inputArr,input);
	}
	
	static void pairValue(int inputArr[], int input){
		
		System.out.println("Pair of Elements and their sum : " );
		
		for(int i=0;i<inputArr.length;i++){
			for(int j=i+1;j<inputArr.length;j++){
				if(inputArr[i]+inputArr[j]==input){
					System.out.println(inputArr[i] + " + " + inputArr[j] + " = " + input);
				}
			}
		}
		
	}

}
