package com.foxmula.assignment2;

import java.util.*;

public class Solution1 extends createArrayList
{
	
	public static void main (String args [])
	{
		int size;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter the size of the ArrayList");
		size = scan.nextInt();
		
		searchArrayList (size);
		scan.close();
	}
}
