package org.qa.demo;

import java.util.function.Consumer;

public class Test9 {

	public static void main(String[] args) {
		Consumer<String> c = s->System.out.println(s);
		
		c.accept("Aritra");
		
	}

}
