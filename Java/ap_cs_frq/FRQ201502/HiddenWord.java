package com.Trinnect.FRQ201502;

import java.util.*;

public class HiddenWord {
	 
	private String solution;
	
	public HiddenWord(String s)
	{
		solution = s;
	}
	
	public String getHint(String guess)
	{
		String output = "";
		
		for (int i=0; i<guess.length(); i++)
		{
			if(guess.charAt(i) == solution.charAt(i))
				output += guess.charAt(i);
			else if ( solution.indexOf(guess.charAt(i)) >= 0 )
				output += "+";
			else
				output += "*";

		}
		
		return output;
	}
}
