package org.qa.javaprogram;

import java.util.Scanner;

import org.apache.poi.util.SystemOutLogger;

public class MatrixAddition {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of rows : " );
		int row = sc.nextInt();
		
		System.out.println("Enter number of cols : " );
		int col = sc.nextInt();
		
		//defining 1st matrix:
		int[][] matrix1 = new int[row][col];
		
		//defining 2nd matrix:
		int[][] matrix2 = new int[row][col];
		
		//defining sum matrix:
		int[][] sumMatrix = new int[row][col];
		
		
		//defining values for 1st matrix:
		System.out.println("Enter Values for 1st Matrix : " );
		
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				matrix1[i][j]=sc.nextInt();
			}
		}
		
		//defining values for 2nd matrix:
		
		System.out.println("Enter Values for 2nd Matrix : " );
		
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				matrix2[i][j]=sc.nextInt();
			}
		}
		
	
		System.out.println("---First Matrix---");
		
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print(matrix1[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("---Second Matrix---");
		
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print(matrix2[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("---Sum of above two Matrix---");
		
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
				System.out.print(sumMatrix[i][j]+"\t");
			}
			System.out.println();
		}
	
	}

}
