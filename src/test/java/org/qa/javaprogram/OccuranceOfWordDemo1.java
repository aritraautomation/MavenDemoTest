package org.qa.javaprogram;

public class OccuranceOfWordDemo1 {
	
	public static int OccuranceWord(String str,String word){
		String a[] = str.split(" ");
		
		int count=0;
		for(int i=0;i<a.length;i++){
			if(word.equals(a[i])){
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String str = "This is Aritra is Singha";
		String word = "is";
		System.out.println(OccuranceWord(str,word));
	}

}
