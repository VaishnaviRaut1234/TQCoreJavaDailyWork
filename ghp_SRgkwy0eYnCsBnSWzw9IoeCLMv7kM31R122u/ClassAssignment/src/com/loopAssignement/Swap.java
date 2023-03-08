//Swap two numbers .

package com.loopAssignement;

import java.util.Scanner;

public class Swap 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1= sc.nextInt();
		
		System.out.println("Enter second number");
		int num2= sc.nextInt();
		System.out.println("Number before swapping "+num1+" "+num2);
		int num;
		
		num=num1;
		num1=num2;
		num2=num;
		
		System.out.println("Number after swapping "+num1+" "+num2);
	}

}
