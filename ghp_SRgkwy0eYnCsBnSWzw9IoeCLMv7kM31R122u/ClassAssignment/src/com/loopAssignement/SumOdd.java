//Write a Java program to find sum of all odd numbers between 1 to n.

package com.loopAssignement;

import java.util.Scanner;

public class SumOdd 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i=0;i<=num;i++)
		{
			if(i % 2 != 0)
			{
				sum = sum + i; 
			}
		}
		System.out.println("Sum of odd numbers are "+sum);

	}

}
