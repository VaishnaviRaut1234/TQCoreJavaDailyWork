package com.demo;

import java.util.Scanner;

public class AlternateNumber 
{

	static Scanner sc= new Scanner (System.in);
	
	public static void enterArray(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			ar[i]= sc.nextInt();
		}
		
	}
	
	public static void printAlternate(int ar[])
	{
		boolean flag= true;
		for(int i:ar) 
		{
			if(flag) 
			{
				System.out.print(i+"  ");
			}
			flag=!flag;
			
		}
	}
	
	public static void printAlternate2(int ar[])
	{
		
		for(int i=0;i<ar.length;i++) 
		{
			if(i%2==0)
			{
				System.out.print(ar[i]+"  ");
			}
			
		}
	}
	
	
	public static void main(String args[])
	{
		System.out.println("Enter the size:");
		int size= sc.nextInt();
		System.out.println("Enter a array elements");
		int myarray[]= new int[size];
	    enterArray(myarray);	
	    
	    System.out.println("Alternate elements are:");

	    printAlternate2(myarray);
	}
}