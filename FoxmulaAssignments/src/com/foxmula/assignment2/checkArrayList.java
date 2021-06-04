package com.foxmula.assignment2;

import java.util.*;

public class checkArrayList 
{
	private static void searchArrayList (int size)
	{
		int element;
		ArrayList <Integer> arr = new ArrayList <Integer> (size);
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter the elements of ArrayList");
		for (int i = 0; i < size ; i++)
		{
			element = scan.nextInt();
			arr.add(element);
		}
		
		System.out.println("Enter the element that you wish to search for");
		element = scan.nextInt();
		
		if(arr.contains(element))
			System.out.println (element + " exists in the ArrayList!");
		else
			System.out.println (element + " does not exist in the ArrayList!");
			
		scan.close();
	}
	public static void main (String args [])
	{
		int size;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter the size of the ArrayList");
		size = scan.nextInt();
		
		searchArrayList (size);
		scan.close();
	}
}