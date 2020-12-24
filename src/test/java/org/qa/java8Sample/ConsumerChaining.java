package org.qa.java8Sample;

import java.util.function.Consumer;

class Movie{
	String name;
	
	Movie(String name){
		this.name =name;
	}
}

public class ConsumerChaining {

	public static void main(String[] args) {
		
		Consumer<Movie> c1 =m->System.out.println(m.name + " Moview start to realease");
		Consumer<Movie> c2 =m->System.out.println(m.name + " Moview realeased but superhit");
		Consumer<Movie> c3 =m->System.out.println(m.name + " storing information in database");
		
		Consumer<Movie> cc = c1.andThen(c2).andThen(c3);
		
		Movie m = new Movie("Spider");
		
		cc.accept(m);

	}

}
