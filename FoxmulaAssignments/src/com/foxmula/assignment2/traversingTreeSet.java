package com.foxmula.assignment2;

import java.util.*;

public class traversingTreeSet 
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
}
