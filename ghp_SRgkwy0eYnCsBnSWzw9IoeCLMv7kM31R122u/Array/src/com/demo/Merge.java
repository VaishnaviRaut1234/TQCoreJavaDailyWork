package com.demo;

import java.util.Scanner;

public class Merge 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of first array");
		int size = sc.nextInt();
		int arr[]= new int[size];
		
		System.out.println("Enter the elements of first array");
		int n1= arr.length;
		for(int i=0;i<n1;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		//------------------------------
		
		System.out.println("Enter the size of second array");
		int size2 = sc.nextInt();
		
		int ar[]= new int[size2];
		System.out.println("Enter the elements of second array");
		int n2 = ar.length;
		for(int i=0;i<ar.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		//---------------------------------------
		
		int s = n1+n2;
		System.out.println("Size of merge array is "+s);
		

	}

}
