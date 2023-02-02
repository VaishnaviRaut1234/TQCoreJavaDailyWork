package com.example;

public class StudentCount 
{
	public static void main(String[] args) 
	{
		System.out.println("Number of Employee = "+Student.sCount);
		Student e1= new Student(1,"Vaishu");
		Student e2= new Student(2,"Rahul");
		Student e3= new Student();
		
		System.out.println("Number of Employee = "+Student.sCount);
		
		

	}
}
