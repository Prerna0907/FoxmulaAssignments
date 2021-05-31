package com.foxmula.assignment2;

import java.util.*;

public class Solution2 extends createHashSet
{	
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