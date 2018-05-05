package com.Trinnect.FRQ201401;


public static String scrambleWord(String word)
{
	String newWord = "";//Starts with an empty string
	int i = 0;//First index of String, declare loop variable
	while (i < word.length() - 1)//from 0 to word, avoid out of bound
	{
		String firstLetter = word.substring(i, i+1); //look at the first letter
		String secondLetter = word.substring(i+1, i+2);//look at the second letter
		if (firstLetter.equals("A") && !secondLetter.equals("A"))
		{
			//swap letters
			newWord += secondLetter;
			newWord += firstLetter;
			i += 2;//Avoids swapping a letter twice
		}
		else
		{
			newWord += firstLetter;
			i++;//Stay the same
		}
	}
	newWord += word.substring(word.length()-1);
	return newWord;
	
}

public static void scrambleOrRemove(List<String> wordList)
{
	for (int i = wordList.size()-1; i >= 0; i--)
	{
		String word = wordList.get(i);
		String scramble = scrambleWord(word);
		if (word.equals(scramble))//match between two words
		{
			wordList.remove(i);
		}
		else
		{
			wordList.set(i, scramble);
		}
	}
}