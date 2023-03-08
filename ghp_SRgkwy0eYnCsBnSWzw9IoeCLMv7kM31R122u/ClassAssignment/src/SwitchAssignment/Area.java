//WAP in java using switch case for following: Area of a circle Area of a square Area of a right angled triangle Area of a rectangle Circumference of a circle Perimeter of a square Accept inputs like radius,side,etc through keyboard.


package SwitchAssignment;

import java.util.Scanner;

public class Area 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.Area of a Circle");
  		System.out.println("2.Area of a Square");
 		System.out.println("3.Area of a Right Angled Triangle");
  		System.out.println("4.Area of a Rectangle");
  		System.out.println("5.Circumference of a Circle");
  		System.out.println("6.Perimeter of a Square");
  		System.out.println("Enter your option");
  		
  		int op = sc.nextInt();
  			
		switch(op)
		{
		case 1:
			System.out.println("Enter radius");
			float r=sc.nextFloat();
			float ac = 3.14f*r*r;
			System.out.println("Area of circle is "+ac);
			break;
		case 2:
			System.out.println("Enter side");
			int side=sc.nextInt();
			int area = side * side;
			System.out.println("Area of square is "+area);
			break;
		case 3:
			System.out.println("Enter length");
			int length=sc.nextInt();
			System.out.println("Enter breadth");
			int breadth=sc.nextInt();
			float areart = (length*breadth)/2;
			System.out.println("Area of right angle triangle is "+areart);
			break;
		case 4:
			System.out.println("Enter length");
			length=sc.nextInt();
			System.out.println("Enter width");
			int width=sc.nextInt();
			int arear = length * width;
			System.out.println("Area of rectangle is "+arear);
			break;
		case 5:
			System.out.println("Enter radius");
			r=sc.nextFloat();
			float cir = 3.14f*2f*r;
			System.out.println("Circumference of a Circle is "+cir);
			break;
		case 6:
			System.out.println("Enter side");
			side=sc.nextInt();
			int per = 4 * side;
			System.out.println("perimeter of square is "+per);
			break;
		default:
				System.out.println("Invalid Input");	
		}
	}

}
