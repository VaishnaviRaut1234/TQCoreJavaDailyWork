// Write a Java program to count number of digits in any number

package com.loopAssignement;

import java.util.Scanner;

public class CountDigit 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int count =0;
		int rem;
		for(int i=0;i<=num;i++)
		{
			rem = num %10;
			count++;
		}
		System.out.println("Number of digits are : "+count);
	}

}
