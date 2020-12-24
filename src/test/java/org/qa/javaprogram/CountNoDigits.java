package org.qa.javaprogram;

public class CountNoDigits {

			//1234-->4 digits
		
		static int countDigits(int n){
			int count=0;
			while(n!=0){
				n=n/10;
				++count;
			}
			return count;
		}
		
		public static void main(String[] args) {
			
			System.out.println(countDigits(1234));
	}

}
