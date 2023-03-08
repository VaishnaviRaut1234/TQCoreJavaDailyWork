// Calculate shopping bill for single item by accepting quantity and price.

package com.loopAssignement;

import java.util.Scanner;

public class Bill 
{

	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter quantity of product");
	double q = sc.nextDouble();
	
	System.out.println("Enter price of product");
	double p = sc.nextDouble();
	
	double bill = q*p;
	
	System.out.println("Enter bill is "+bill+" Rs.");

	}

}
