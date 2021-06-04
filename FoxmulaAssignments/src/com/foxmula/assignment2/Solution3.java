package com.foxmula.assignment2;

import java.util.*;

public class Solution3 
{
	private static void usingIterator (HashSet<Integer> h)
	{
		System.out.println ("Traversal of HashSet Using Iterator ()");
		
		Iterator <Integer> itr = h.iterator ();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	
	private static void usingForLoop (HashSet<Integer> h)
	{ 
		System.out.println ("Traversal of HashSet using For Loop");
		
		for (Integer element : h)
		{
			System.out.println (element);
		}
	}
	
	public static void main (String args [])
	{
		int size, element;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter the size of HashSet");
		size = scan.nextInt();
		
		HashSet <Integer> set = new HashSet <Integer> (size);
		
		System.out.println("Enter the elements of HashSet");
		for (int i = 0; i < size ; i++)
		{
			element = scan.nextInt();
			set.add(element);
		}
		
		usingForLoop (set);
		
		usingIterator (set);
		
		scan.close ();
	}
}