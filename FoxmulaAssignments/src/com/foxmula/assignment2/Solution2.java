package com.foxmula.assignment2;

import java.util.*;

public class Solution2
{	
	private static void searchHashSet (int size)
	{
		int element;
		HashSet <Integer> set = new HashSet <Integer> (size);
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter the elements of HashSet");
		for (int i = 0; i < size ; i++)
		{
			element = scan.nextInt();
			set.add(element);
		}
		
		System.out.println(set);
		
		System.out.println("Enter the element that you wish to search for");
		element = scan.nextInt();
		
		if(set.contains(element))
			System.out.println (element + " exists in the HashSet!");
		else
			System.out.println (element + " does not exist in the HashSet!");
			
		scan.close();
	}
	public static void main (String args [])
	{
		int size;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter the size of the HashSet");
		size = scan.nextInt();
		
		searchHashSet (size);
		scan.close();
	}
}