package org.qa.java8Sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student{
	String name;
	int marks;
	
	Student(String name,int marks){
		this.name=name;
		this.marks=marks;
	}
		/*public String toString(){
			return marks + ":" + name;
		}*/
}

class StudentByFunctionInterface {

	public static void main(String[] args) {
		
		Function<Student,String> f=s->{
			int marks=s.marks;
			String grade = "";
			if(marks>=80) grade="A[Distinction]";
			else if(marks>=60) grade="B[First Class]";
			else if(marks>=50) grade="C[Second Class]";
			else if(marks>=35) grade="D[Third Class]";
			else grade="E[Fail]";
			
			return grade;			
		};
		
		Predicate<Student> p=s->s.marks>=60;
		
		Consumer<Student> c=s1->{
			System.out.println(s1.name);
			System.out.println(s1.marks);
			System.out.println(f.apply(s1));
			System.out.println();
		};
		
		Student[] s = {
				new Student("Durga",90),
				new Student("Ravi",44),
				new Student("Nagarjuna",68),
				new Student("Peter",55),
				new Student("Harry",34)
				};
		
		/*ArrayList<Student> s = new ArrayList<Student>();
		
		s.add(new Student("Durga",90));
		s.add(new Student("Ravi",44));
		s.add(new Student("Nagarjuna",68));
		s.add(new Student("Peter",55));
		s.add(new Student("Harry",34));
	*/
		//System.out.println(l);
		
		for(Student s1:s){
			if(p.test(s1)){
			c.accept(s1);
		}
		
		
	
		
		
		/*Collections.sort(l,(s1,s2)->
		(s1.marks<s2.marks)?1:(s1.marks>s2.marks)?-1:0);
		System.out.println(l);*/
		
				

	}

}
}
