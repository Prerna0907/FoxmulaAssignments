package com.foxmula.assignment3;

import java.util.*;

public class checkPrimeOdd
{
	private static boolean checkOdd (int n)
	{
		if (n % 2 != 0)
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}
	
	private static boolean checkPrime(int n)
	{
        if (n <= 1)
        {
            return false;
        }
        
        else if (n == 2)
        {
            return true;
        }
        
        else if (n % 2 == 0)
        {
            return false;
        }
        
        for (int i = 3; i <= Math.sqrt(n); i += 2)
        {
            if (n % i == 0)
            {
                return false;
            }
        }
        return true;
	}
	
	private static void checkException (int n) throws primeOddException
	{
		if(checkPrime(n) && checkOdd (n))
		{
			throw new primeOddException("The given number is Odd and Prime!");
		}
	}
	
	public static void main (String args[])
	{
		int num;
		Scanner scanner = new Scanner (System.in);
		
		System.out.println ("Enter the number:");
		num = scanner.nextInt();
		
		
		try
		{
			checkException (num);
		}
		
		catch (primeOddException p)
		{
			System.out.println ("EXCEPTION!");
			System.out.println (p.getMessage());
		}
		
		scanner.close();
	}
}
