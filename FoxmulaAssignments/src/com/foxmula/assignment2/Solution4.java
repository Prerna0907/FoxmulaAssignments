package com.foxmula.assignment2;

import java.util.*;

public class Solution4 
{
	public static void usingIterator (TreeSet<Integer> tree)
	{
		System.out.println ("Traversal of TreeSet using Iterator()");
		
		Iterator <Integer> itr = tree.iterator ();

		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	
	public static void usingForLoop (TreeSet<Integer> tree)
	{
		System.out.println ("Traversal of TreeSet using For Loop");
		
		for (Integer element : tree)
		{
			System.out.println (element);
		}
	}
	public static void main (String args [])
	{
		int size, element;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter the size of TreeSet");
		size = scan.nextInt();
		
		TreeSet <Integer> treeSet = new TreeSet <Integer> ();
		
		System.out.println("Enter the elements of TreeSet");
		for (int i = 0; i < size ; i++)
		{
			element = scan.nextInt();
			treeSet.add(element);
		}
		
		usingForLoop (treeSet);
		
		usingIterator (treeSet);
		
		scan.close ();
	}
}
