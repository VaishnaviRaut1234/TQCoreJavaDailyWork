package com.demo;

import java.util.Arrays;

public class Element 
{

	public static void findUncommon(int a1[],int b1[])
	{
		boolean flag;
		for(int i=0;i<b1.length;i++)
		{
			flag=false;
			for(int j=0;j<a1.length;j++)
			{
				if(b1[i]==a1[j])
					flag=true;
			}
			if(!flag)
			{
				System.out.print(b1[i]+" ");
			}
		}
	}
	public static void main(String[] args) {
		int arr1[]= {1,2,3,4,5};
		int arr2[]= {1,2,5,7,8};
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		findUncommon(arr1, arr2);
		
		


	}

}
