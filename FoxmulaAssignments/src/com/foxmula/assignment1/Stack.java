package com.foxmula.assignment1;

public class Stack 
{
	public class Node 
	{
	    int element;
	    Node link;
    }
	
	int size = -1;
	Node top;

	Stack()
	{
		this.top = null;
	}

	public void push(int x) 
	{
		Node temp = new Node();
		
	    temp.element = x;
	    temp.link = top;
	    top = temp;
	    size = size + 1;
	    System.out.println("push() successful");
	}

	public boolean checkEmpty()
	{
		if(size == -1)
			return true;
		
		else
			return false;
	}

	public void pop()
	{
		if (size == -1) 
		{
			System.out.println("Stack Underflow");
		}
		
		else
		{
			top = (top).link;
			System.out.println("pop() successful");
		}
	}
	
	public int count()
	{
		if (size == -1)
			return 0;
		else
			return (size+1);
	}
}
