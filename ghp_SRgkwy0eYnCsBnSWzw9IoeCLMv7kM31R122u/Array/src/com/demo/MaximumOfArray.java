package com.demo;

import java.util.Scanner;

public class MaximumOfArray 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out .println("Enter the size of array");
		int size = sc.nextInt();
		
		int a[]= new int[size];
		
		System.out.println("Enter the elements of array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}

		int max = a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
				max= a[i];
		}
		System.out.println("Maximum number is : "+max);
	}

}
