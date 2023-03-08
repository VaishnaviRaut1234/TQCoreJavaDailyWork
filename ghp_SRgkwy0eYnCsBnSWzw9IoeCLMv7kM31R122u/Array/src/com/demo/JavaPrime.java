package com.demo;

import java.util.Scanner;

public class JavaPrime 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		
		int arr[]= new int[size];
		System.out.println("Enter the elements of array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Prime numbers are : ");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0 && arr[i]!=1 && arr[i]%i!=0)
			{
				System.out.print(arr[i]+" ");
			}
		}

	}

}
