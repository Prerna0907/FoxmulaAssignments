package com.foxmula.assignment1;
import java.util.Scanner;

public class Solution3 
{
	public static void main (String args [])
	{
		Scanner sc = new Scanner(System.in);
		int ch, choice;
		double result;
		double x0, y0, x1, y1, x2, y2, x3, y3, h;
		System.out.println("WHOSE AREA DO YOU WISH TO CALCULATE?");
		System.out.println("1. Sqaure \n2. Rectangle \n3. Trapezoid \n4. Parallelogram");
		choice = sc.nextInt();
		
		do
		{
			System.out.println("Enter the coordinates of the quadilateral");
			x0 = sc.nextInt();
			y0 = sc.nextInt();
			x1 = sc.nextInt();
			y1 = sc.nextInt();
			x2 = sc.nextInt();
			y2 = sc.nextInt();
			x3 = sc.nextInt();
			y3 = sc.nextInt();
			switch(choice)
			{
			case 1:
					Square obj1 = new Square(x0, y0, x1, y1, x2, y2, x3, y3);
					result = obj1.area();
					System.out.println("The area of the square is" + result);
					break;
			case 2:
					Rectangle obj2 = new Rectangle(x0, y0, x1, y1, x2, y2, x3, y3);
					result = obj2.area();
					System.out.println("The area of the rectangle is" + result);
					break;
			
			case 3:
					System.out.println("Enter the height");
					h = sc.nextInt();
					
					Trapezoid obj3 = new Trapezoid(x0, y0, x1, y1, x2, y2, x3, y3,h);
					result = obj3.area();
					System.out.println("The area of the trapezoid is" + result);
					break;
					
			case 4:
					System.out.println("Enter the height");
					h = sc.nextInt();
				
					Parallelogram obj4 = new Parallelogram(x0, y0, x1, y1, x2, y2, x3, y3,h);
					result = obj4.area();
					System.out.println("The area of the parallelogram is" + result);
					sc.close();
					break;
			
			default:
					System.out.println("Wrong Input");
					break;
			}
			System.out.println("If you wish to continue press 0");
			ch = sc.nextInt();
		} while(ch == 0);
	}
}