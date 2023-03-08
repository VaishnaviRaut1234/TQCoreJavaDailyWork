package com.example;

public class Student 
{

	private int id; 
	private String name;
	
	
	static private String schoolName;
	
	static
	{
		schoolName="Joseph school";
	}
	
	static 
	{
		
	}
	
	{
		id=100;
		name="Unknown";
	}
	
	public  Student()
	{
		id=000;
		name="NA";
		
	}
	
	public Student(int id, String name)
	{
		this.id=id;
		this.name=name;
		
	}
	
	public String toString()
	{
		return id+" "+name+" "+schoolName;
	}
	
	
	static public void setSchoolName(String schoolName)
	{
		Student.schoolName=schoolName;
	}
	
	static public String getSchoolName()
	{
		return Student.schoolName;
	}

	public static void main(String[] args) 
	{
		
		System.out.println("School name:"+schoolName);
	
		Student s1= new Student(101,"Pritish");
		System.out.println("school name:"+schoolName);
		System.out.println(s1);
		
		Student s2= new Student(102,"Kunal");
		System.out.println(s2);
		

		
		System.out.println(s1);
        System.out.println(s2); 

}
}
