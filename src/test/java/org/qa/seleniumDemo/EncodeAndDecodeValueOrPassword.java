package org.qa.seleniumDemo;

import org.apache.commons.codec.binary.Base64;

public class EncodeAndDecodeValueOrPassword {

	public static void main(String[] args) {
		
		String password = "test123";
		
		byte[] encodedPassword = Base64.encodeBase64(password.getBytes());
		System.out.println("Encoded Password is " + new String(encodedPassword));
		
		byte[] decodedPassowrd = Base64.decodeBase64(encodedPassword);
		System.out.println("Decoded Password is " + new String(decodedPassowrd));

		
	}

}
