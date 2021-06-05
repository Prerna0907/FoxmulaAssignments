package com.foxmula.assignment3;

import java.util.*;

public class sortingValuesUsingQuickSort
{
	static void swap(int[] arr, int i, int j)
	{
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}
	
	static int partition(int[] arr1, int [ ] arr2,  int low, int high)
	{
	    int pivot = arr1[high];
	    int i = (low - 1);
	 
	    for(int j = low; j <= high - 1; j++)
	    {
	        if (arr1[j] < pivot)
	        {
	            i++;
	            swap(arr1, i, j);
	            swap(arr2, i, j);
	        }
	    }
	    swap(arr1, i + 1, high);
	    swap(arr2, i + 1, high);
	    return (i + 1);
	}
	static void quickSort(int[] arr1, int[] arr2, int low, int high)
	{
	    if (low < high)
	    {
	        int pi = partition(arr1, arr2, low, high);
	        quickSort(arr1, arr2, low, pi - 1);
	        quickSort(arr1, arr2, pi + 1, high);
	    }
	}
	
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
			hashMap.put(key, count);
			System.out.println (key + " comes " + count + " times in the array");
		}
		
		System.out.println(hashMap);
		
		int [] elements = new int [hashMap.size()];				
		int [] values = new int [hashMap.size()];
		
		i = 0;
		for (Integer value : hashMap.values())
		{
				values [i] = value;
				i++;
		}
		
		i = 0;
		for (Integer key : hashMap.keySet())
		{
				elements [i] = key;
				i++;
		}
		
		quickSort (values, elements, 0, hashMap.size()-1);
		
		System.out.println ("Array after sorting it by value is:");
		for(i=0; i<hashMap.size(); i++)
		{
			System.out.println (elements[i]);
		}
		scanner.close();
	}
}

