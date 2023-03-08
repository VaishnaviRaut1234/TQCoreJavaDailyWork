// WAP to accept base and index from user and calculates power.

package com.loopAssignement;

import java.util.Scanner;

public class Power 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a base");
		int base = sc.nextInt();
		
		System.out.println("Enter a index");
		int index = sc.nextInt();
		int power = 1;
		
		for(int i=1;i<=index;i++)
		{
			power = power * base;
		}
		System.out.println(base+" to the Power "+index+" is "+power);
	}

}
