//Check Whether entered number is Armstrong

package com.loopAssignement;

import java.util.Scanner;

public class Armstong {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    int count = 0, num , remainder;
	    System.out.println("Enter a number");
	    num = sc.nextInt();
	    
	    while (num != 0) 
	    {
	    remainder = num % 10;
	      num /= 10;
	      ++count;
	      System.out.print(remainder +" ");
	    }
	    System.out.println();
	    System.out.println("Number of digits: " + count);
	  }
	

}
