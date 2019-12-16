package org.qa.javasample;

public class MissingNumber {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7,9};
		
		int s1=0;
		
		for(int i=0;i<a.length;i++){
			s1=s1+a[i];//12
		}
		System.out.println(s1);
	
	
	int s2=0;
	
	for(int j=1;j<=a.length+1;j++){
		s2 = s2 + j;
	}
	System.out.println(s2);
	
	System.out.println("Missing Number is ::" + (s2-s1));
		
}

}
