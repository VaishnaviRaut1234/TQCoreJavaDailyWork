//Write a Java program to find the duplicate values of an array of integer values. Means e.g. arr[] = [3, 10, 90, 78, 56, 10, 78, 34, 61], so duplicates are 10 and 78.

package com.demo;

import java.util.Scanner;

public class Duplicate 
{

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
		
		for (int i = 0; i < a.length; i++)
        {
            for (int j = i; j < a.length; j++)
            {
                if ((a[i] == a[j]) && (i != j))
                {
                    System.out.println("Duplicate Elements are : "+a[j]);
                }
            }
        }
	}

}
