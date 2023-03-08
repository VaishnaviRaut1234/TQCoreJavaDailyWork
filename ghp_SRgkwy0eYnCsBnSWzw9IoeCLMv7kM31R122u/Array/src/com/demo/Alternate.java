package com.demo;

import java.util.Scanner;

public class Alternate 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int count=0, sum=0;
		int arr[]= new int[size];
		System.out.println("Enter the elements of array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		 for(int i= 0; i< arr.length; i++)
		    {
		        if (i % 2 == 0)
		        {
		            sum = sum+arr[i];
		            count++;
		            
		        }
		    }
		// System.out.println(sum);
		 System.out.println("Alternate number Average is "+(float)(sum/count));
	
	}

}
