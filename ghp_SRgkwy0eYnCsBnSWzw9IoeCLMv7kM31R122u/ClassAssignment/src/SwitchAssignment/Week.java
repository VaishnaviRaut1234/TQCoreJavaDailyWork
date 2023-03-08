//Write a program that displays the day of the week corresponding to the number entered. i.e., 1 - "Monday", 2- "Tuesday" and so on.for any integer input not between 1 to 7 it should display "error, day does not exist"

package SwitchAssignment;

import java.util.Scanner;

public class Week 
{
	static void checkDays(int num)
	{
		switch(num)
		{
		case 1 :
				System.out.println("Monday");
				break;
		case 2: 
				System.out.println("Tuesday");
				break;
		case 3:
				System.out.println("Wednesday");
				break;
		case 4:
				System.out.println("Thursday");
				break;
		case 5 :
				System.out.println("Friday");
				break;
		case 6:
				System.out.println("Saturday");
				break;
		case 7:
				System.out.println("Sunday");
				break;
		default :
				System.out.println("error, day does not exist");
				
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		checkDays(num);

	}

}
