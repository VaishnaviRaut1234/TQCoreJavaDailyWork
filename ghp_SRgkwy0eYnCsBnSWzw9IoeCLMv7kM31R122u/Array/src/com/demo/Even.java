package com.demo;

import java.util.Scanner;

public class Even 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int sum =0;
		int a[] = new int[size];
		System.out.println("Enter the elements of array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				sum +=a[i];
			}
		}
		
		System.out.println("Sum of even number of array : "+sum);
		

	}

}
