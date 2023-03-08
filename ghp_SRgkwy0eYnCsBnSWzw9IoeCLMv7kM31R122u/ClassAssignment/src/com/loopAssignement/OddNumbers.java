// WAP to print odd numbers from 121 to 229 using while loop. 


package com.loopAssignement;

public class OddNumbers 
{

	public static void main(String[] args) 
	{
		int i=121;
		while(i<=229)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
			i++;
		}

	}

}
