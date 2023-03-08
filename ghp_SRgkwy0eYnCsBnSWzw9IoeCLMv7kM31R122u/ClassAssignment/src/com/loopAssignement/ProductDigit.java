//Write a Java program to calculate product of digits of any number.

package com.loopAssignement;

import java.util.Scanner;

public class ProductDigit 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		int rem;
		int product=1;
		for(int i=1;i<=num;i++)
		{
			rem = num %10;
			product = product * rem;
			num=num/10;
		}
		System.out.println("Product of digits are : "+product);
	}

}
