package com.foxmula.assignment1;

public class Time 
{
	int hour, min, sec;
	
	Time ( ) 
	{
		this.hour = 0;
		this.min = 0;
		this.sec = 0;
	}
	
	Time (int hour, int min, int sec)
	{
		this.hour = hour;
		this.min = min;
		this.sec = sec;
	}
	
	public void printTime ()
	{
		System.out.println(hour + ":" + min + ":" + sec);
	}
	
	public Time add(Time t)
	{
		Time add1 = new Time( );
		add1.hour = this.hour + t.hour;
		add1.min = this.min + t.min;
		add1.sec = this.sec + t.sec; 
		
		if(add1.sec >= 60)
		{
			add1.min++;
			add1.sec = add1.sec - 60;
		}
		
		if(add1.min >= 60)
		{
			add1.hour++;
			add1.min = add1.min - 60;
		}
		
		return (add1);
	}
}
