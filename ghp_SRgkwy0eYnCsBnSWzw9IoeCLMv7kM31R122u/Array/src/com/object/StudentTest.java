package com.object;

import java.util.Arrays;
import java.util.Scanner;

public class StudentTest {

	static Scanner sc = new Scanner(System.in);
	
	public static void enterEmployeeDetails(Employee e)
	{
		System.out.println("Enter your Id");
		e.setId(sc.nextInt());
		
		System.out.println("Enter your name");
		e.setName(sc.next());
		
		System.out.println("Enter your marks");
		e.setSalary(sc.nextFloat());
	}
	public static void main(String[] args) 
	{
		Employee em[] = new Employee[3];
		int i;
		
		for(i=0;i<em.length;i++)
		{
			em[i] = new Employee();
			
			enterEmployeeDetails(em[i]);
		}
		for(Employee e:em)
		{
			System.out.println(Arrays.toString(em));
		}
		
	}

}
