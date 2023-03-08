//Write a program for class and object : (main outside class)

package com.oops;

class Stud
{
		int id = 5;
		String name = "Vaishnavi";		
}

public class Student 
{
	public static void main(String args[])
	{
		Stud s1 = new Stud();
		Stud s2 = new Stud();
		System.out.println(s1.id);
		System.out.println(s1.name);
	}
}
