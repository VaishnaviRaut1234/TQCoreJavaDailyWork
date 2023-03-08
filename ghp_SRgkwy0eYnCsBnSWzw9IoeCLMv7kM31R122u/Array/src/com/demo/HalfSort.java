package com.demo;

import java.util.Arrays;
import java.util.Scanner;

public class HalfSort 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		
		
		int arr[]= new int[size];
		int n = arr.length;
		System.out.println("Enter the elements of array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		
		for(int i = 0; i < arr.length / 2; i++) 
		{
         
            int j = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = j;
		}
		System.out.println("Reversed Array :" + Arrays.toString(arr));

	}

}
