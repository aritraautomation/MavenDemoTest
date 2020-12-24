package org.qa.javasample;

import org.apache.commons.codec.binary.Base64;

public class EncodeAndDecode {

	public static void main(String[] args) {
		
		String test = "test123";
		
		 byte[] encodedString = Base64.encodeBase64(test.getBytes());
		 System.out.println("Encoded string : " + new String(encodedString));
		 
		 byte[] decodedString = Base64.decodeBase64(encodedString);
		 System.out.println("Decoded string : " + new String (decodedString)); 
		 
		 
	}

}
