package com.foxmula.assignment2;

import java.util.*;

public class Solution5 
{
	public static void usingHashSet (ArrayList <Integer> arr)
	{
		int count;
		HashSet <Integer> set = new HashSet <Integer> (arr);
		System.out.println ("Using HashSet");
		for (Integer element : set)
		{
			count = Collections.frequency (arr, element);
			System.out.println ("In the given ArrayList " + element + "occurs " + count + "times");
		}
		System.out.println ();
	}
	
	public static void usingTreeSet (ArrayList <Integer> arr)
	{
		int count;
		TreeSet <Integer> tree = new TreeSet <Integer> (arr);
		System.out.println ("Using TreeSet");
		for (Integer element : tree)
		{
			count = Collections.frequency (arr, element);
			System.out.println ("In the given ArrayList " + element + " occurs " + count + "times");
		}
		System.out.println ();
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
		
		usingHashSet (arr);
		usingTreeSet (arr);
		
		scan.close();
	}
}
