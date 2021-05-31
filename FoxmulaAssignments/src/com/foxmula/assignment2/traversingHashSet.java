package com.foxmula.assignment2;

import java.util.*;

public class traversingHashSet 
{
	public static void usingIterator (HashSet<Integer> h)
	{
		System.out.println ("Traversal of HashSet Using Iterator ()");
		
		Iterator <Integer> itr = h.iterator ();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	
	public static void usingForLoop (HashSet<Integer> h)
	{ 
		System.out.println ("Traversal of HashSet using For Loop");
		
		for (Integer element : h)
		{
			System.out.println (element);
		}
	}
}
