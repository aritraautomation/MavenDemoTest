package org.qa.javaprogram;

public class PermutationString {

	public static void main(String[] args) {
		String s = "ABC";
		int n = s.length();
		//PermutationString p = new PermutationString();
		//p.permute(s,0,n-1);
		permute(s,0,n-1);
		
	}
	
	static void permute(String st, int l, int r){
		if(l==r){
			System.out.println(st);
		}
		else{
			for (int i = l; i <= r; i++){
				st = swap(st,l,i);				
				permute(st,l+1,r);
				st = swap(st,l,i);
				
			}
			
		}
	}
	
	static String swap(String s, int start, int end){
		
		char temp;		
		char[] ch = s.toCharArray();
		
		temp = ch[start];
		ch[start] = ch[end];
		ch[end] = temp;
		
		return String.valueOf(ch);
		
	}

}
