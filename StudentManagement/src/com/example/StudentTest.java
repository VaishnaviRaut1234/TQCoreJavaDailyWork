package com.example;

import java.util.Scanner;

public class StudentTest 
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student id");
		int id = sc.nextInt();
		
		System.out.println("Enter Student Name");
		String name = sc.next();
		
		System.out.println("Enter Student age");
		int age = sc.nextInt();
		
		Course c = new Course();
		System.out.println("Enter course details");
		
		System.out.println("Enter course id");
		sc.nextLine();
		int courseid = sc.nextInt();
		
		System.out.println("Enter course name");
		String coursename = sc.next();
		
		System.out.println("Enter fees");
		float coursefees = sc.nextFloat();
		
		Course cr = new Course(courseid,coursename,coursefees);
		Student s = new Student(id,name,age, c);
		
		s.setCourse(cr);
		
		s.showStudentDetails();
	}

}
