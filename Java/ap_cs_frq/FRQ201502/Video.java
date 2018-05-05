package com.Trinnect.FRQ201502;

public class Video {

	public static void main(String[] args) {
		
		HiddenWord hwHiddenWord = new HiddenWord("ABCDE");
		
		System.out.println(hwHiddenWord.getHint("AAAAA"));
		System.out.println(hwHiddenWord.getHint("ADCHE"));
		System.out.println(hwHiddenWord.getHint("ABCDE"));
		
	}
}
