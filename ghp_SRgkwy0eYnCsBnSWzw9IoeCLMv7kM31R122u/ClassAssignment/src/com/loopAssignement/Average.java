//calculate average of all entered numbers. Keep entering numbers until user says ‘N’

package com.loopAssignement;

import java.util.Scanner;

public class Average 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int sum = 0;
		int count=0;
		float avg;
		System.out.println("Enter number to find average");
		for(int i=0;i<num;i++)
		{
			int n = sc.nextInt();
			sum=sum+n;
			count++;
		}
		avg = (float)sum/count;
		System.out.println("Average is "+avg);
		

	}

}
