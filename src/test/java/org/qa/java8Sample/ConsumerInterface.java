package org.qa.java8Sample;

import java.util.function.Consumer;

public class ConsumerInterface {

	public static void main(String[] args) {
		Consumer<String> c=s->System.out.println(s);
		c.accept("durga");
	}

}
