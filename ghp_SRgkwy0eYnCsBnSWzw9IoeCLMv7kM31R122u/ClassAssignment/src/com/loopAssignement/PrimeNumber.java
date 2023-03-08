package com.loopAssignement;

public class PrimeNumber 
{
	public static void main(String args[])
	{    
		int prime=0,n=0,i=1,j=1;  
		while(n<10)  
		{  
			j=1;  
			prime=0;  
		while(j<=i)  
		{  
			if(i%j==0)  
				prime++;  
			j++;   
		}  
		if(prime==2)  
		{  
		System.out.print(i+" ");  
		n++;  
		}  
		i++;  
		}  
		  } 
		  
}
