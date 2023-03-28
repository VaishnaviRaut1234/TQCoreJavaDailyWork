package com.example;

public class Course 
{
	private int cId;
	private String cName;
	private float fees;
	
	
	public int getcId() 
	{
		return cId;
	}
	
	public void setcId(int cId) 
	{
		this.cId = cId;
	}
	
	public String getcName() 
	{
		return cName;
	}
	
	public void setcName(String cName) 
	{
		this.cName = cName;
	}
	
	public float getFees() 
	{
		return fees;
	}
	
	public void setFees(float fees) 
	{
		this.fees = fees;
	}

	public Course() 
	{
		
	}
	
	public Course(int cId, String cName, float fees) 
	{
		this.cId = cId;
		this.cName = cName;
		this.fees = fees;
	}
	
	void showCourseDetails()
	{
		System.out.println("Course Id is "+cId);
		System.out.println("Course Name is "+cName);
		System.out.println("Course fees are "+fees);
	}
}
