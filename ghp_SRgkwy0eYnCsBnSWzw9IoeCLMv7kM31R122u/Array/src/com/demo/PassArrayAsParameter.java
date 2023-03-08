package com.demo;

import java.util.Scanner;

public class PassArrayAsParameter 
{
	public void findMinimum(int arr[])
	{
		int min = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("Minimum value is : "+min);
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		System.out.println("Enter elements of array");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		PassArrayAsParameter obj = new PassArrayAsParameter();
		obj.findMinimum(arr);

	}

}
