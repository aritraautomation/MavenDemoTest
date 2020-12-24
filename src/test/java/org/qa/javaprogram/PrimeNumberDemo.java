package org.qa.javaprogram;

public class PrimeNumberDemo {

	public static void main(String[] args) {
		
		// Validate given number is Prime Number or not
		
		/*int n=17;
		
		boolean flag=false;
			
			for(int i=2;i<=n/2;i++){
			if(n%i==0){
				flag=true;
				break;
			}
		}
		if(!flag){
			System.out.println(n + " is Prime Number");
		}
		else{
			System.out.println(n + " is not Prime Number");
		}*/
			
		
		
		
	     //Prime Number displayed as per given range
		
		  int lowRange=1;
		  int highRange=20;
		
		   while(lowRange<=highRange){
			
			     boolean flag=false;
			
			      for(int i=2;i<=lowRange/2;i++){
			          if(lowRange%i==0){
				      flag=true;
				      break;
			       }
		        }
		
			    if(!flag){
			       System.out.println(lowRange + " is Prime Number");
		        }
			    
			    lowRange++;
					
        	}
		
       }
		
}


