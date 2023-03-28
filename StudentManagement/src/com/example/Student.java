package com.example;

public class Student 
{
	private int id;
	private String name;
	private int age;
	 Course csr;
	
	 public Student() 
		{
			
		}
	public Student(int id, String name, int age, Course cs) 
		{
			this.id = id;
			this.name = name;
			this.age = age;
			csr = cs;
		}
	
	void showStudentDetails()
	{
		System.out.println("Student id is "+id);
		System.out.println("Student name is "+name);
		System.out.println("Student age is "+age);
		csr.showCourseDetails();
	}
	
	public void setCourse(Course courses)	//set address for particular employee
	{
		courses=csr;
	}
	
}
