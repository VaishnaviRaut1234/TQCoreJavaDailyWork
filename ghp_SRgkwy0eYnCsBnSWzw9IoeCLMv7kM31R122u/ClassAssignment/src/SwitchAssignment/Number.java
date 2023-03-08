//Write a Java program to enter number between 1 to 5 and print it in word.

package SwitchAssignment;

import java.util.Scanner;

public class Number 
{
	static void number(int n)
	{
		switch(n)
		{
		case 1:
				System.out.println("One");
				break;
		case 2:
				System.out.println("Two");
				break;
		case 3:
				System.out.println("Three");
				break;
		case 4:
				System.out.println("Four");
				break;
		case 5:
				System.out.println("Five");
				break;
		default :
				System.out.println("Error, Invalid input");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		
		number(n);
		
	}

}
