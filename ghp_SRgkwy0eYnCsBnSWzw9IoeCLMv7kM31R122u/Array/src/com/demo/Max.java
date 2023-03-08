package com.demo;

import java.util.Scanner;

public class Max {

	static void arrMax(int ar[])
	{
		
		int max = ar[0];
		for(int i:ar)
		{
			if(i>max)
				max= i;
		}
		System.out.println("Maximum number is : "+max);
	}
	
	static void arrMin(int ar[])
	{
		
		int min = ar[0];
		for(int i:ar)
		{
			if(i<min)
				min= i;
		}
		System.out.println("Minimum number is : "+min);
	}
	
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
		arrMax(a);
		arrMin(a);
		
	}

}
