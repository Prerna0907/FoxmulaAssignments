package com.foxmula.assignment1;

class Parallelogram extends Quadrilateral
{
	double height;
	Parallelogram (double x0, double y0, double x1, double y1, double x2, double y2, double x3, double y3, double height)
	{
		super (x0, y0, x1, y1, x2, y2, x3, y3);
		this.height = height;
	}
	
	double area()
	{
		double side1 = (int)Math.sqrt((x0-x1)*(x0-x1) + (y0-y1)*(y0-y1));
		double res = (int) (side1*height);
		return res;
	}
}