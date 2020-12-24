package org.qa.javasample;

public class TriangleDemo2 {

	public static void main(String[] args) {
		int number=1;
		
		for(int i=3;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print(number + " ");
				number++;
			}
			System.out.println();
		}
	}
}

//Output:
/*
1 2 3 
4 5 
6 
*/