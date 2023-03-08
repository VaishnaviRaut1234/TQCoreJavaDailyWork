//Write a Java program to check whether a number is even or odd using switch case .

package SwitchAssignment;

import java.util.Scanner;

public class EvenOdd 
{
	static void oddeven(int num)
	{
	int x = num%2;
	switch(x)
	{
	case 0:
		System.out.println("Number is even");
		break;
	case 1:
		System.out.println("Number is odd");
		break;
	default :
		System.out.println("Invalid input");
	}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int num=sc.nextInt();
		
		oddeven(num);
	}
		

	

}
