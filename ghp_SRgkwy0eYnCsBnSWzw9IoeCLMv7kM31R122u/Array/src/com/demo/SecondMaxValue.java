package com.demo;

import java.util.Scanner;

public class SecondMaxValue 
{
	public static void secondHighest(int arr[])
	{
		int highest=Integer.MIN_VALUE;
		int secondhi=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>highest)
				{
				  secondhi= highest;
				   highest=arr[i];
				}
			if((arr[i]>highest)&&(arr[i]<secondhi))
			{
				secondhi=arr[i];
			}
			  
			
		}
		
		System.out.println("Second Highest:"+secondhi);
		
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		
		int myarr[]= new int[size];
		
		System.out.println("Enter the elements of array");
		for(int i=0;i<myarr.length;i++)
		{
			myarr[i]=sc.nextInt();
		}
		
		
		secondHighest(myarr);
	}
}
