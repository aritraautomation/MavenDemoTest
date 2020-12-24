package org.qa.java8Sample;

import java.util.function.Supplier;

public class SupplierDemo1 {

	public static void main(String[] args) {
		Supplier<String> s = ()->{
			String OTP = "";
			
			for(int i=0;i<6;i++){
				OTP = OTP + (int)(Math.random()*10);
			}
			return OTP;
		};
		
		System.out.println(s.get());
		
	}

}
