package com.loopAssignement;

import java.util.Scanner;

public class LeftStar 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		for(int i=0;i<num;i++) 
		{
			for(int j=0;j<(num-i);j++)
			{
				System.out.print("*");
			}
			for(int k=0;k<num;k++)
			{
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
