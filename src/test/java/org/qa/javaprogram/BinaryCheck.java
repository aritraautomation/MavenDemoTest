package org.qa.javaprogram;

public class BinaryCheck {

	public static void main(String[] args) {
		System.out.println(isBinaryNumber(110));
	}
	
	static boolean isBinaryNumber(int num){
		
		if((num==0)||(num==1)||(num<0)){
			return false;
		}
		
		while(num!=0){
			if(num%10>1){
				return false;
			}
			num = num/10;
		}
		return true;
		
	}
	

}
