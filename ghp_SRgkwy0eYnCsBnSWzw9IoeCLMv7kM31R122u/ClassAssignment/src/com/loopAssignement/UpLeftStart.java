package com.loopAssignement;

import java.util.Scanner;

public class UpLeftStart 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=(num-i);j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int k=1;k<=num;k++)
			{
				System.out.print(" ");
			}
			System.out.println();
		}
*/

	}

}
