//	Write a program in Java to display the first 10 terms of the following series: 10, 20, 30, 40, ……..

package com.loopAssignement;

import java.util.Scanner;

public class Series 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		for(int i=10;i<=num;i+=10)
		{
			
			System.out.print(i+" ");
		}

	}

}
