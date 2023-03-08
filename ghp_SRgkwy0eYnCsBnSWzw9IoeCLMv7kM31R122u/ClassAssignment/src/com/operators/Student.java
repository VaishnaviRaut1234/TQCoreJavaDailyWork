//Write a Java program to enter marks of five subjects and calculate total, average and percentage.

package com.operators;

import java.util.Scanner;

public class Student 
{

	public static void main(String[] args) 
	{
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter marks of sub1 ");
		int sub1 = sc.nextInt();
		
		System.out.println("Enter marks of sub2 ");
		int sub2 = sc.nextInt();
		
		System.out.println("Enter marks of sub3 ");
		int sub3 = sc.nextInt();
		
		System.out.println("Enter marks of sub4 ");
		int sub4 = sc.nextInt();
		
		System.out.println("Enter marks of sub5 ");
		int sub5 = sc.nextInt();
		
		int total = sub1 + sub2 + sub3 + sub4 + sub5;
		
		System.out.println("Total marks is "+total);
		
		double avg = total/5;
		
		System.out.println("Average is "+avg);
		
		double per = (total/500.0)*100;
		
		System.out.println("Percentage is "+per+"%");
		
		
	}

}
