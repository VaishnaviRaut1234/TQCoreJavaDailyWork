package com.loopAssignement;

import java.util.Scanner;

public class Rhombus 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int k=1; k<=(n-i);k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");	
			}
			for(int l=1;l<=(n-i);l++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
