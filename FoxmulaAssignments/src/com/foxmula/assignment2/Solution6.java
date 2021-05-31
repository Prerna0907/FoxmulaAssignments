package com.foxmula.assignment2;

import java.util.*;

public class Solution6 
{
	public static void checkSum (ArrayList <Integer> arr)
	{
		Scanner scan = new Scanner (System.in);
		int sum;
		
		System.out.println ("Enter the sum");
		sum = scan.nextInt ();
		
		System.out.println ("The pairs of elements whose sum is " + sum + " are:");
		for (int i = 0; i < arr.size(); i++)
		{
			for (int j = i+1; j <arr.size (); j++)
			{
				if ((arr.get(i) + arr.get(j)) == sum)
				{
					System.out.println ("(" + arr.get(i) + ", " + arr.get(j) + ")" );
				}
			}
		}
		scan.close();
	}
	
	public static void main (String args [])
	{
		int element, size;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter the size of the ArrayList");
		size = scan.nextInt();
		
		ArrayList <Integer> arr = new ArrayList <Integer> (size);
		
		System.out.println("Enter the elements of ArrayList");
		for (int i = 0; i < size ; i++)
		{
			element = scan.nextInt();
			arr.add(element);
		}
		
		checkSum (arr);
		scan.close();
	}
}
