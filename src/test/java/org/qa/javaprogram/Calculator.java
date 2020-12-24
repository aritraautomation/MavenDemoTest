package org.qa.javaprogram;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter two Numbers : ");
		
		double firstNum = sc.nextDouble();
		double secondNum = sc.nextDouble();
		
		System.out.println("Please enter an operator : (+,-,*,/): ");
		char operator = sc.next().charAt(0);
		
		double result =0;
		
		switch(operator){
		
		case '+':
			result = firstNum + secondNum;
			break;		
		
		case '-':
			result = firstNum - secondNum;
			break;	
			
		case '*':
			result = firstNum * secondNum;
			break;	
			
		case '/':
			result = firstNum / secondNum;
			break;	
			
		default:
			System.out.println("Please pass the correct operator");
			break;	
		}
		
		System.out.println(result);
	}

}
