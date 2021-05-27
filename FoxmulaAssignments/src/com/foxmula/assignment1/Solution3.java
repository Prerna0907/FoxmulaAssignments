package com.foxmula.assignment1;
import java.util.Scanner;

class Quadrilateral
{
	double x0, y0, x1, y1, x2, y2, x3, y3;
}

class Square extends Quadrilateral
{
	Square (double x0, double y0, double x1, double y1, double x2, double y2, double x3, double y3)
	{
		this.x0 = x0;
		this.y0 = y0;
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
	}
	
	double area()
	{
		double side = (int)Math.sqrt((x0-x1)*(x0-x1) + (y0-y1)*(y0-y1));
		return side*side;
	}
}

class Rectangle extends Quadrilateral
{
	Rectangle (double x0, double y0, double x1, double y1, double x2, double y2, double x3, double y3)
	{
		this.x0 = x0;
		this.y0 = y0;
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
	}
	
	double area()
	{
		double side1 = (int)Math.sqrt((x0-x1)*(x0-x1) + (y0-y1)*(y0-y1));
		double side2 = (int)Math.sqrt((x0-x3)*(x0-x3) + (y0-y3)*(y0-y3));
		return side1*side2;
	}
}

class Trapezoid extends Quadrilateral
{
	double height;
	Trapezoid (double x0, double y0, double x1, double y1, double x2, double y2, double x3, double y3, double height)
	{
		this.x0 = x0;
		this.y0 = y0;
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
		this.height = height;
	}
	
	double area()
	{
		double side1 = (int)Math.sqrt((x0-x1)*(x0-x1) + (y0-y1)*(y0-y1));
		double side2 = (int)Math.sqrt((x2-x3)*(x2-x3) + (y2-y3)*(y2-y3));
		double res = (int) ((side1 + side2)*height)/2;
		return res;
	}
}

class Parallelogram extends Quadrilateral
{
	double height;
	Parallelogram (double x0, double y0, double x1, double y1, double x2, double y2, double x3, double y3, double height)
	{
		this.x0 = x0;
		this.y0 = y0;
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
		this.height = height;
	}
	
	double area()
	{
		double side1 = (int)Math.sqrt((x0-x1)*(x0-x1) + (y0-y1)*(y0-y1));
		double res = (int) (side1*height);
		return res;
	}
}

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