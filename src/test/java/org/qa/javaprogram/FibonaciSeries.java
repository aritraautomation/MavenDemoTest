package org.qa.javaprogram;

public class FibonaciSeries {

	public static void main(String[] args) {
		//0 1 1 2 3 5 8 13 ....
		
		int range=12;
		
		int t1=0;
		int t2=1;
				
		for(int i=1;i<=range;i++){
			System.out.print(t1 + " ");//0 1 1 2 3
			
			int sum = t1+t2;//0+1=1, 1+1=2, 1+2=3 2+3=5
			
			t1=t2;     //1 1 2 3
			t2=sum;    //1 2 3 5	
			
		}
	}

}
