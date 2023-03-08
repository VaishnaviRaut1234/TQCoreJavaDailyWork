package com.loopAssignement;

import java.util.Scanner;

public class ElectricityBill 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Units consumed in this month");
		int units = sc.nextInt();
		int bill=0;
		
		if(units<=50)
		{
			bill = units * 2;
			System.out.println("Bill for this month is "+bill);
		}
		else if(units<=80)
		{
			bill = 100 + ((units-50) * 3);  //50 *2=100
			System.out.println("Bill for this month is "+bill);
		}
		else if(units<=100)
		{
			bill = 190 + ((units - 80) * 4); // 50 * 2= 100, 30 * 3 = 90 -- 100 + 90=190
			System.out.println("Bill for this month is "+bill);
		}
		else
		{
			bill = 270 + ((units - 100) * 7); // 50 * 2= 100, 30 * 3 = 90 , 20 * 4 = 80 -- 100 + 90 +80=270 
			System.out.println("Bill for this month is "+bill);
		}
	}

}
