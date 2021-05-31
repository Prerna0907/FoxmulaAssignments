package com.foxmula.assignment2;

import java.util.HashSet;
import java.util.Scanner;

public class createHashSet 
{
	public static void searchHashSet (int size)
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
}
