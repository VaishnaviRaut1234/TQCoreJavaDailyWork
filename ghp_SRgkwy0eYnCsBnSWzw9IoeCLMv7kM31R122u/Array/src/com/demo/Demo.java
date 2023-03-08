package com.demo;

public class Demo 
{
	static void reverse(String ar[])
	{
		String reS = "";
		 
		for (int i = 0; i < ar.length; i++) 
	    {
	      String word = ar[i];
	      String reW = "";
	      for (int j = word.length() - 1; j >= 0; j--) 
	      {
	        reW= reW + word.charAt(j);
	      }
	      reS = reS + reW + " ";
	    }
		
		System.out.print(reS);
	}
	
	
	public static void main(String[] args) 
	{
	
		String arr[] = {"java", "sql", "angular"};
		
		reverse(arr);
	}
}
