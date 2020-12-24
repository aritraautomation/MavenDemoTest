package org.qa.demo;

import java.util.ArrayList;
import java.util.function.Function;

//As per grade of Student, returns name, marks and grade of Student:

class Student{
	
	String name;
	int marks;
		
	Student(String name,int marks){
		this.name = name;
		this.marks = marks;
	}
	
}
public class Test8 {

	public static void main(String[] args) {
		
		Function<Student,String> f = s->
		{
			int marks = s.marks;
			String grade = "";
			
			if(marks>=80) grade="A[Distinction]";
			else if(marks>=60) grade="B[First Class]";
			else if(marks>=50) grade="C[Second Class]";
			else if(marks>=35) grade="D[Third Class]";
			else grade="E[Failed]";
			return grade;
		};
		
		
		ArrayList<Student> al = new ArrayList<Student>();
		
		al.add(new Student("Harry",25));
		al.add(new Student("Durga",95));
		al.add(new Student("Peter",60));
		al.add(new Student("Bunny",55));
		al.add(new Student("Chinny",45));
		
		for(Student s1:al){
			System.out.println("Student name : " + s1.name);
			System.out.println("Student marks : " + s1.marks);
			System.out.println("Student grade : " + f.apply(s1));
			
			System.out.println("***********************");
		}

	}

}
