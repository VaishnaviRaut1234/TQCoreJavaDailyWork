package com.demo;

import java.util.Scanner;

public class Simple {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		
		int size = sc.nextInt();
		int arr[]= new int[size];
		System.out.println("Enter array elements");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Array elements are");
		for(int i=0;i<arr.length;i++)
		{
			//System.out.println("Enter a number");
			//
			System.out.print(arr[i]+" ");
		}

	}

}
