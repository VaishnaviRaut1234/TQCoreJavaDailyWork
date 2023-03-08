package com.demo;

import java.util.Scanner;

public class OddAvg 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size of array");
		int size = sc.nextInt();
		int sum =0,count=0;
		float avg;
		int a[] = new int[size];
		System.out.println("Enter the elements of array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Odd numbers are");
		for(int i=0;i<a.length;i++)
		{
			if(i%2!=0)
			{
				sum= sum+a[i];
				count++;
			}
		}
		avg = (float)sum/count;
		System.out.println("Avg of odd numbers are : "+avg);
	}

}
