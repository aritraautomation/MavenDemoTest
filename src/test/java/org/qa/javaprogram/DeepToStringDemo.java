package org.qa.javaprogram;

import java.util.Arrays;

//Arrays.deepToString() --> This method is designed for converting multidimensional arrays to strings. 
//The simple toString() method works well for simple arrays, but doesn’t work for multidimensional arrays.

public class DeepToStringDemo {

	public static void main(String[] args) {
		
		int[][] mat = new int[2][3];
		 mat[0][0] = 12;
		 mat[0][1] = 14;
		 mat[0][2] = 15;
		 
		 mat[1][0] = 16;
		 mat[1][1] = 14;
		 mat[1][2] = 19;
		 
		 System.out.println(Arrays.deepToString(mat));

	}

}

//output: [[12, 14, 15], [16, 14, 19]]