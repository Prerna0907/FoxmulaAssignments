package com.foxmula.assignment2;

import java.util.*;

public class Solution3 extends traversingHashSet
{
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