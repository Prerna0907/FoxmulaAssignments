package com.foxmula.assignment3;

import java.util.*;

public class countFrequencySort 
{
	public static void main (String args [])
	{
		Scanner scanner = new Scanner (System.in);
		
		System.out.println ("Enter the size of the Array");
		int size = scanner.nextInt();
		int i, count;
		
		int[] arr = new int [size];
	
	
		System.out.println ("Enter the elements of the Array");
		
		for (i = 0; i < size; i++)
		{
			arr[i] = scanner.nextInt();
		}
		
		System.out.println();
		
		HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
		
		for (i = 0; i < size; i++) 
		{
            hashMap.put(arr[i], i);
        }
		
		for (Integer key : hashMap.keySet())
		{
			count = 0;
			for (i = 0 ; i < size; i++)
			{
				if (arr[i] == key)
				{
					count ++;
				}
			}
			System.out.println (key + " comes " + count + " times in the array");
		}
		
		Arrays.sort(arr);
		for(i=0; i<arr.length; i++)
		{
			System.out.println (arr[i]);
		}
		
		scanner.close();
	}
}
