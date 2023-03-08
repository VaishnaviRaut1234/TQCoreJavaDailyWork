// WAP to find 2nd min value in an array [-20, 0, -25, 15, 19, 37, 23]

package com.demo;

public class SecondMinValue 
{
	public static int Min(int a[], int total)
	{
		int temp;
		for(int i=0;i<total;i++)
		{
			for(int j=1+i;j<total;j++)
			{
				if (a[i]<a[j])
				{
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[total-2];
	}

	public static void main(String[] args)
	{
	
		
		int a[]= {-20, 0, -25, 15, 19, 37, 23};
		
		System.out.println("Second Smallest number is : "+Min(a,7));
	}

}
