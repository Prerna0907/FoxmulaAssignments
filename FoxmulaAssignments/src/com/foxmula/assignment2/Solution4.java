package com.foxmula.assignment2;

import java.util.*;

public class Solution4 extends traversingTreeSet
{
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
