package org.qa.demo;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class StudentTest{
	
	String name;
	int marks;
	
	StudentTest(String name,int marks){
		this.name = name;
		this.marks = marks;		
	}
	
}
public class Teat10 {

	public static void main(String[] args) {
		
		Function<StudentTest,String> f = s->{
			int marks = s.marks;
			String grade ="";
			
			if(marks>=80) grade="A[Distinction]";
			else if(marks>=60) grade="B[First Class]";
			else if(marks>=50) grade="C[Second Class]";
			else if(marks>=35) grade="D[Third Class]";
			else grade="E[Failed]";
			return grade;			
		};
		
		Predicate<StudentTest> p = s->s.marks>=60;
		
		Consumer<StudentTest> c = s->
		{
			System.out.println("Student Name: " + s.name);
			System.out.println("Student Name: " + s.marks);
			System.out.println("Student Name: " + f.apply(s));
			System.out.println();
		};
		
		StudentTest[] s = {
				new StudentTest("Durga", 99),
				new StudentTest("Sunny", 67),
				new StudentTest("Bunny", 59),
				new StudentTest("Liza", 44),
				new StudentTest("Peter", 32)
		};
		
		for(StudentTest s1:s){
			if(p.test(s1)){
				c.accept(s1);
			}
		}

	}

}
