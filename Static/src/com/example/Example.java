package com.example;

public class Example 

{
	int id;
	String name;
	static String schoolname;
	
	public Example()
	{
		
	}
	
	public Example(int id, String name)
	{
		this.id=id;
		this.name=name;
		schoolname="Joseph School";
	}
	
	public String toString()
	{
		return id+" "+name+" "+schoolname;
	}

	public static void main(String[] args) 
	{
		System.out.println(schoolname);
		Example s1 = new Example(101,"Vaishnavi");
		System.out.println("School Name "+schoolname);
		System.out.println(s1);
		
		Example s2=new Example(102,"Rahul");
		System.out.println(s2);
		
		schoolname="st Mary";
		System.out.println(s1);
		System.out.println(s2);
	}

}
