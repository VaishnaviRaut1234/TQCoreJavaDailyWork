package com.demo;

public class Swap {

	public static void halfSwap(int arr[])
	{
		int j=(arr.length/2);
		int temp;
		for(int i=0;i<arr.length/2;i++)
		{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			j++;
		}
		
	}
	public static void printArray(int arr[])
	{
		for(int i:arr)
		{
			System.out.print(i+ " ");
		}
	}
	public static void main(String[] args) 
	{
		int arr[]= {2,4,9,0,6,7};
		System.out.println("Swap");
		halfSwap(arr);
		printArray(arr);

	}

}
