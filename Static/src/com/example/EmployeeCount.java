package com.example;

public class EmployeeCount 
{

	public static void main(String[] args) 
	{
		System.out.println("Number of Employee = "+Employee.empCount);
		Employee e1= new Employee(1,"Vaishu",5875f);
		Employee e2= new Employee(2,"Rahul",5875f);
		Employee e3= new Employee();
		
		System.out.println("Number of Employee = "+Employee.empCount);
		

	}

}
