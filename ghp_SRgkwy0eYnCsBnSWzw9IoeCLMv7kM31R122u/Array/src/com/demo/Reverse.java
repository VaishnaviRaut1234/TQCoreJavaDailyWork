package com.demo;

import java.util.Scanner;

public class Reverse {

	static void reverse(int ar[])
	{
		int temp[]=new int[ar.length];
		int j=0;;
		for(int i=(ar.length-1);i>=0;i--)
		{
			temp[j++]=ar[i];
		}
		
		printArray(temp);
		
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=temp[i];
		}
	}
	static void printArray(int arr[])
	{
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
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
		
		System.out.println("Array element before reverse : ");
		printArray(a);
		
		
		
		System.out.println();
		System.out.println("Array element after reverse");
		reverse(a);

	}

}
