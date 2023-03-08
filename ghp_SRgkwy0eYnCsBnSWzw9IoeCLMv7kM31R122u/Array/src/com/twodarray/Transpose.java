package com.twodarray;

public class Transpose
{
	public static void calTranspose(int[][] myarr)
	{
		int rows, cols;
		rows=myarr.length;
		System.out.println(rows);
		cols=myarr[0].length;
		System.out.println(cols);
	}
	public static void main(String[] args) 
	{
		int myarr[][]= {{1,2,3},
						{6,0,7},
						{5,4,10}};
		calTranspose(myarr);
		}

	}

