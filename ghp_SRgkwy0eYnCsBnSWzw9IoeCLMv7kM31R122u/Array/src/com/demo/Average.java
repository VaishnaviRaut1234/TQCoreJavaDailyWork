package com.demo;

import java.util.Scanner;

public class Average 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		
		float arr[]= new float[size];
		float sum=0;
		System.out.println("Enter the elements of array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextFloat();
		}
		
		for(int i=0;i<arr.length;i++)
		{
			sum = sum + arr[i];
		}
		
		System.out.println("Average is : "+(sum/size));

	}

}
