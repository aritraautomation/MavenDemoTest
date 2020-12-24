package org.qa.javaprogram;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number of rows : " );
		int rows = sc.nextInt();
		
		System.out.println("Enter Number of cols : " );
		int cols = sc.nextInt();
		
		//defining 2D array to hold matrix data:
		
		int[][] matrix=new int[rows][cols];
		
		System.out.println("---Enter the data---");
		
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				matrix[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
	}

}
