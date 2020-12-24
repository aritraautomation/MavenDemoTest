package org.qa.javasample;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] x = new int[4];
		System.out.println(x);//[I@15db9742
		
		
		/*int[] y = new int[-6];//RE:NegativeArraySizeException
		System.out.println(y);*/
		
		int[] z = new int[0];
		System.out.println(z);//[I@6d06d69c
		
		int[][] p = new int[2][];
		
		System.out.println(p);//[[I@7852e922
		System.out.println(p[0]);//null
		System.out.println(p[1]);//null
		//System.out.println(p[2]);//RE:ArrayIndexOutOfBoundsException
		//System.out.println(p[-1]);//RE:ArrayIndexOutOfBoundsException
		
		//System.out.println(p[0][0]);//RE:NullPointerException
		//System.out.println(p[1][1]);//RE:NullPointerException
		
		//Array of Arrays:
		
		int[][] q = new int[2][3];
		q[0][2]=4;
		System.out.println(q[0]);//[I@4e25154f
		System.out.println(q[1]);//[I@70dea4e
		System.out.println(q[0][0]);//0
		System.out.println(q[0][1]);//0
		System.out.println(q[0][2]);//4
		//System.out.println(q[1][-1]);//RE:ArrayIndexOutOfBoundsException
		
		int[] m = {1,4,5};
		
		System.out.println(m[2]);//5
		
		
		int[][] n = {{1,4,5},{2,8}};
		System.out.println(n);//[[I@5c647e05
		System.out.println(n[0][1]);//4
		System.out.println(n[1][1]);//8
		System.out.println(n[0]);//[I@33909752
		
				
		String[][] s = {{"a","b"},{"c","d","e"},{"f","g"}};

		System.out.println(s);//[[Ljava.lang.String;@55f96302
		System.out.println(s[0][1]);//[Ljava.lang.String;@3d4eac69
		System.out.println(s[1][1]);//RE:ArrayIndexOutOfBoundsException
		/*System.out.println(s[0]);//[[S@33909752
		
		System.out.println(s[0][0][1]);//b
		System.out.println(s[2][0][1]);//a
*/		

		
	}

}







