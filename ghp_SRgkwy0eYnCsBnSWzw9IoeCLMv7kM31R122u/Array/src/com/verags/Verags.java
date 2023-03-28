package com.verags;

import java.util.Scanner;

public class Verags 
{
	public static void arrayEvenAndOdd(int arr[], int n) 
	{ 
	    int i = -1, j = 0; 
	    while (j != n) { 
	        if (arr[j] % 2 == 0) 
	        { 
	            i++; 
	            int temp = arr[i]; 
	            arr[i] = arr[j]; 
	            arr[j] = temp; 
	        } 
	        j++; 
	    } 

	     
	    for (int k = 0; k < n; k++) 
	        System.out.print(arr[k] + " "); 
	} 

	 
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter size of an array");
			int n = sc.nextInt();
			
			int arr[] = new int[n];
			System.out.println("Enter elements of an array");
			for (int i=0; i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			arrayEvenAndOdd(arr, n); 
		}
	

}
