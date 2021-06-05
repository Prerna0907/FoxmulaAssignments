package com.foxmula.assignment3;

import java.util.*;

public class countFrequencySort 
{
	public static HashMap<Integer, Integer> sortByValue (HashMap<Integer, Integer> hm)
    {
       List<Map.Entry<Integer, Integer> > list = new LinkedList<Map.Entry<Integer, Integer> >(hm.entrySet());
 
        Collections.sort
        (
        list, new Comparator<Map.Entry<Integer, Integer> >() 
        {
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
         
        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> aa : list) 
        {
            temp.put(aa.getKey(), aa.getValue());
        }
        
        return temp;
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
		System.out.println ();
		
		Map<Integer, Integer> sortedHashMap = sortByValue(hashMap);
		
		System.out.println ("Output after sorting the values is :");
		for (Map.Entry<Integer, Integer> en : sortedHashMap.entrySet()) 
		{
            System.out.println(en.getKey());
		}
		
		scanner.close();
	}
}
