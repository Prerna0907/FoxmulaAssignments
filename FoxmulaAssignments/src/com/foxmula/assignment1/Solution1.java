package com.foxmula.assignment1;
import java.util.Scanner;

public class Solution1 
{
	public static void main (String args [])
	{
		Scanner sc = new Scanner(System.in);
		int h, m, s;
		System.out.println ("Enter the hour, minutes and seconds for the first object:");
		h = sc.nextInt();
		m = sc.nextInt();
		s = sc.nextInt();
		Time obj1 = new Time (h, m, s);
		System.out.println ("Enter the hour, minutes and seconds for the second object:");
		h = sc.nextInt();
		m = sc.nextInt();
		s = sc.nextInt();
		Time obj2 = new Time (h,m,s);
		
		Time obj3 = obj1.add(obj2);
		obj3.printTime();
		
		sc.close();
	}
}
