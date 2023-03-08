//Print 1 to 5 numbers using switch.

package SwitchAssignment;

import java.util.Scanner;

public class PrintNumber 
{
	static void number(int n)
	{
		switch(n)
		{
		case 1:
				System.out.println("One");
		case 2:
				System.out.println("Two");
		case 3:
				System.out.println("Three");
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

