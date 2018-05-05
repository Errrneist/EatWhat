package com.Trinnect.FRQ201504;



public class Range implements NumberGroup{

	private int min, max;
	public Range(int m1, int m2)
	{
		min = m1;
		max = m2;
		
	}
	
	public boolean contains(int x)
	{
		return min <= x && x <= max;
	}
	
}
