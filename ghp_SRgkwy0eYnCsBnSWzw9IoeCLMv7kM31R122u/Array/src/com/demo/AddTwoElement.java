package com.demo;

import java.util.Scanner;

public class AddTwoElement {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		
		int arr[]= new int[size];
		int i;
		int sum = 0;
		System.out.println("Enter the elements of array");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
	
		for(i=0;i<arr.length;i++)
		{
			sum += arr[i];
		}
		int count = 0;
	
		int temp = sum;
		/*while(sum>0)  
		{  
		
		sum=sum/10;  
		
		count++;  
		}  */
		int result =0;
		do  
		{  
	 
		int digit=temp%10;  
		  
		result += digit;
		temp=temp/10;  
		
		count--;  
		
	}while(temp > 0 && temp<10);
		
		System.out.println(result);
	}

}
