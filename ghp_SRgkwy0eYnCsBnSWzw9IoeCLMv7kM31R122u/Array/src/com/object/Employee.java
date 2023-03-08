package com.object;

public class Employee 
{

	private int id;
	private String name;
	private float Salary;
	
	
	public Employee() {
		super();
		
	}


	public Employee(int id, String name, float Salary) {
		super();
		this.id = id;
		this.name = name;
		this.Salary = Salary;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getSalary() {
		return Salary;
	}


	public void setSalary(float Salary) {
		this.Salary = Salary;
	}

	@Override
	public String toString() {
		return "Employee Details are : id=" + id + ", name=" + name + ", Salary=" + Salary;
	}
	
}
