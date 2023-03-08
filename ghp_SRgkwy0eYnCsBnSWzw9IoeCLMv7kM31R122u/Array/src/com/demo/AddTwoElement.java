package com.demo;

import java.util.Scanner;

public class AddTwoElement {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		
		int arr[]= new int[size];
		int i;
		System.out.println("Enter the elements of array");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
	
		for(i=0;i<arr.length-2;i++)
		{
			arr[i]+=arr[i+1]+arr[i+2];
			System.out.print(arr[i]+" ");
		}
		System.out.print(arr[arr.length - 2]+" "+arr[arr.length - 1] );

	}

}
