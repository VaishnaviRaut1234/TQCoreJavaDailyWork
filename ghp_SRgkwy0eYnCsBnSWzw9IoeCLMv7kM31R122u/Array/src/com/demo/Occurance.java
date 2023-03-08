package com.demo;

import java.util.Scanner;

public class Occurance 
{

	    public static void main(String[] args) {  
	       
	    	Scanner sc = new Scanner(System.in);
			System.out.println("Enter the size of array");
			int size = sc.nextInt();
			int arr[]= new int[size];
			System.out.println("Enter the elements of array");
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=sc.nextInt();
			}
			
			System.out.println("Enter element for search");
			 
			 int num = sc.nextInt();
			 
			 for(int i=0;i<arr.length;i++){    
		            if(arr[i] == num)
		            {    
		            	System.out.println(num+" is found at index: "+i);    
		            }    
		        }    
	     
	    }
	    }  

