package com.diamond;

public class School implements Student , Teacher{

	public void display()
	{
		Student.super.display();  //diamond problem
		Teacher.super.display();	//diamond problem
	}
	public static void main(String[] args) {
		
		School s = new School();
		s.display();

	}

}
