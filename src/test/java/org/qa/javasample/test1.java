package org.qa.javasample;

public class test1{

	public static void main(String[] args) {
		int i = 5;
		boolean t = true;
		float f = 2.3F;
		double d = 2.3;

	//t = (boolean) i;//CE:Cannot cast from int to boolean
	//f = d; //cannot convert from double to float
	d = i;
	i = 5;
	//f = 2.8; //cannot convert from double to float
	}

}
