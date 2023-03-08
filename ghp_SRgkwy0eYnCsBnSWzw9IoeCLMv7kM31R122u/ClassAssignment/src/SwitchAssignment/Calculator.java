//Write a Java program to create Simple Calculator using switch case Menu Driven 

package SwitchAssignment;

import java.util.Scanner;

public class Calculator 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = sc.nextInt();
		
		System.out.println("Enter second number");
		int num2 = sc.nextInt();
		
		double result =0;
		System.out.println("Enter a correct option");
		System.out.println("1.Addition 2.Subtraction 3.Multiplication 4.Division");
		char op = sc.next().charAt(0);
		
		switch(op)
		{
		case '1' :
				result = num1 + num2;
				break;
		
		case '2' :
				result = num1 - num2;
				break;
				
		case '3' : 
				result = num1 * num2;
				break;
				
		case '4' : 
				result = num1/num2;
				break;
				
		}
		
		System.out.println(result);

	}

}
