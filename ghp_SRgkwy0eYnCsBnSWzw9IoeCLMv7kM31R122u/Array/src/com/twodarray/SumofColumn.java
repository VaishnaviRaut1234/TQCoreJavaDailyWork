package com.twodarray;

import java.util.Scanner;

public class SumofColumn  
{  
    public static void main(String[] args) 
    {  
    	int   sumRow, sumCol;  
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the size of rows");
    	int rows = sc.nextInt();
        
    	System.out.println("Enter the size of columns");
    	int cols = sc.nextInt();
          
       /*
        int a[][] = {     
                        {1, 2, 3},  
                        {4, 5, 6},  
                        {7, 8, 9}  
                    };  
            */
    	int a[][]=new int [rows][cols];
        System.out.println("Enter a element");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
         
          rows = a.length;  
        cols = a[0].length;  
          
        int max= a[0][0];
       
        for(int i = 0; i < cols; i++){  
            sumCol = 0;  
            for(int j = 0; j < rows; j++){  
              sumCol = sumCol + a[j][i];  
             
              if(max<a[i][j]){

                  max= a[i][j];
              }
              
            }  
           
            System.out.println("Sum of " + (i+1) +" column: " + sumCol);  
        }  
        System.out.println("Maximum number is "+ max);
    }  
}  