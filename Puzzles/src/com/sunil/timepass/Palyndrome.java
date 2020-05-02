package com.sunil.timepass;

public class Palyndrome {
	
	public boolean checkPalyndrome(String word)
	{
		String upperword = word.toUpperCase();
		char wordarray[] = upperword.toCharArray();
		int length = upperword.length();
		
		for (int i=0; i <= length/2; i++)
		{
			if (wordarray[i] == wordarray[length-i - 1])
			{
				i= i++;
			}
			else
			{
				return false;
			}
		}
			
		return true;	
	}
}
