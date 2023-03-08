package com.demo;

import java.util.Scanner;

public class Odd 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size of array");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		System.out.println("Enter the elements of array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Odd numbers are");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.print(a[i]+", ");
			}
		}
	}

}
