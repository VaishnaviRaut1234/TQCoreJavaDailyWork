//Write a Java program to find sum of all even numbers between 1 to n. 

package com.loopAssignement;

import java.util.Scanner;

public class SumEven 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i=0;i<=num;i+=2)
		{
			if(i % 2 == 0)
			{
				sum = sum + i; 
			}
		}
		System.out.println("Sum of even numbers are "+sum);
	}

}
