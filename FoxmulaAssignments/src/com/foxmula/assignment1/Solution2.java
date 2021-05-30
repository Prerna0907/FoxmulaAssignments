package com.foxmula.assignment1;

import java.util.Scanner;

public class Solution2 
{
	static void check (Stack s1, Stack s2)
	{
		if(s1.count() == s2.count())
		{
			System.out.println ("Both the stack have equal number of elements equal to:" + s1.count());
		}
	}
	
	public static void main (String args[])
	{
		Scanner sc = new Scanner (System.in);
		int choice,element,ch;
		
		Stack ob1 = new Stack( );
		Stack ob2 = new Stack( );
		
		do
		{
			System.out.println("MENU \n1. Push in Stack 1 \n2. Push in Stack 2 \n3. Pop in Stack 1 \n4. Pop in Stack 2 \n5. Check if Stack 1 is empty \n6. Check if Stack 2 is empty");
			System.out.println ("Enter your choice");
			ch= sc.nextInt();
			
			switch(ch)
			{
				case 1:
					System.out.println("Enter the element");
					element = sc.nextInt();
					ob1.push(element);
					check(ob1,ob2);
					break;
					
				case 2:
					System.out.println("Enter the element");
					element = sc.nextInt();
					ob2.push(element);
					check(ob1,ob2);
					break;
					
				case 3:
					ob1.pop();
					check(ob1,ob2);
					break;
					
				case 4:
					ob2.pop();
					check(ob1,ob2);
					break;
					
				case 5:
					ob1.checkEmpty();
					check(ob1,ob2);
					break;
				
				case 6:
					ob2.checkEmpty();
					check(ob1,ob2);
					break;
					
				default:
					System.out.println("Wrong Input");
					break;
			}
			
			System.out.println("If you wish to continue press 0");
			choice = sc.nextInt();
			
		} while(choice == 0);
		
		sc.close();
	}
}