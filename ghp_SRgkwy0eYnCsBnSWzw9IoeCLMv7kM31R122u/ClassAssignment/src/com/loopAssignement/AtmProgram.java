package com.loopAssignement;

import java.util.Scanner;

public class AtmProgram 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int bal=20000, dep, with;
		
			System.out.println("Enter correct choice");
			System.out.println("1.Withdraw");
			System.out.println("2.Deposite");
			System.out.println("3.Check Balance");
			
			int ch = sc.nextInt();
			switch(ch)
			{
			case 1:
					System.out.println("Enter amount you want to withdraw");
					with = sc.nextInt();
					if(bal<=20000)
					{
						bal = bal - with;
						System.out.println("Collect your cash");
						System.out.println("Your Balance is "+bal);
					}
					else
					{
						System.out.println("Insufficient balance");
					}
					break;
			case 2:
					System.out.println("Enter amount of balnace you deposite");
					dep = sc.nextInt();
					bal = bal +dep;
					System.out.println("Your Balanace is "+bal);
					break;
			case 3:
					System.out.println("Your balance is "+bal);
					break;
			default :
					System.out.println("Invalid Input");
			}
		}

	}


