//Write a Java program to find the common elements between two arrays.

package com.demo;

import java.util.Scanner;

public class Common 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out .println("Enter the size of array");
		int size = sc.nextInt();
		int i ,j;
		int a[]= new int[size];
		
		System.out.println("Enter the elements of first array");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter the elements of second array");
		for(j=0;j<a.length;j++)
		{
			a[j]=sc.nextInt();
		}
		for (int k = 0; k < a.length-1; k++) 
		{
            if (a[i] == a[j] && (i != j)) 
                {
                	System.out.println(a[j]+ " ");
                }
 
           }
		}
	}



