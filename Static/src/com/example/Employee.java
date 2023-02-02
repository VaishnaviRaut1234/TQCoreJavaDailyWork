package com.example;

public class Employee 
{
	private int eid;
	private String name;
	private float salary;
	
	static String companyName="Focus Edumatics";
	static int empCount=0;
	//instance block
	{
		empCount++;
	}
	public Employee()
	{
		//empCount++;
	}
	
	public Employee(int eid, String name, float salary)
	{
		this.eid=eid;
		this.name=name;
		this.salary=salary;
		//empCount++;
	}

	public int getEid() 
	{
		return eid;
	}



	public void setEid(int eid) 
	{
		this.eid = eid;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public static String getCompanyName() {
		return companyName;
	}



	public static void setCompanyName(String companyName) {
		Employee.companyName = companyName;
	}



	public static void main(String[] args) {
		

	}

}
