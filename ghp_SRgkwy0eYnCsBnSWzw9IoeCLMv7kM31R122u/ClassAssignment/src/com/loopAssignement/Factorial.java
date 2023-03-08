package com.loopAssignement;

import java.util.Scanner;
public class Factorial 
{
	public static void main(String args[])
	{
		 long i,fact=1;  
		 Scanner sc = new Scanner(System.in);
			int number;
			System.out.println("Enter a Number");
			number = sc.nextInt();

		  for(i=1;i<=number;i++){    
			    
			  fact=fact*i;
			  System.out.println( " = "+fact);
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact);    
		 
	}
}
