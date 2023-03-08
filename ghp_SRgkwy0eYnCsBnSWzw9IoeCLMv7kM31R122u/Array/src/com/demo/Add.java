package com.demo;

import java.util.Scanner;

public class Add 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		
		int arr[]= new int[size];
		int ar[]= new int[size];
		int i,k;
		System.out.println("Enter the elements of first array");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the elements of second array");
		for(i=0;i<arr.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("Addition of array");
		int[] c = new int[arr.length];
		for(k=0;k<arr.length-1;++k)
		{
			c[k] = arr[i] + ar[i];
			System.out.println(c[k]+" ");
		}

	}

}
