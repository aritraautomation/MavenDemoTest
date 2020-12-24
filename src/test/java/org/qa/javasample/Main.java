package org.qa.javasample;

import java.util.Scanner;
public class Main {
	
      public static void main(String[] args)
	       {
    	  try
    	  {
	              Scanner sc=new Scanner(System.in);
	              int flag=0;
	              while(sc.hasNextLine())
	              {
	                     String str=sc.nextLine();
	                     Long N=Long.parseLong(str);
	                     char[] chars = str.toCharArray();
	                    for(char c : chars){
	                       if(Character.isDigit(c)){
	                             System.out.println(c);
	                             if(c=='3')
	                             {
	                            	 flag=1;
	                            	 break;
	                             }
	                       }
	                    }
	                    if(flag==1) {
	                    	while(N > 1229)
	                    	{
	                    		N--;
	                    	}
	                    		System.out.println(N);
	                    	}
	                    else
	                    {
	                    		System.out.println(N);
	                    }
	              }
	       }
    	  catch(NumberFormatException e){
    		 System.out.println("Please enter number only !!");
    		 System.exit(0);
    	  }
    	  
	       }
     
	}




