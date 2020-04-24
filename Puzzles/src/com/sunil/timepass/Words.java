package com.sunil.timepass;

import java.util.Map;
import java.util.TreeMap;

public class Words {
	
	public Map FindWord(String words)
	{  
		String FinalWords = words.replaceAll("[.?]", "");
		String WordArray[]=FinalWords.split(" ");
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		
		for (int i =0; i < WordArray.length; i++)
		{
			if (map.containsKey(WordArray[i]))
			{
				int j = map.get(WordArray[i]);
				map.put(WordArray[i], ++j);

			}
			else
			{
				map.put(WordArray[i], 1);
			}
			
		}
		
		return map;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Words obj = new Words();
		System.out.println(obj.FindWord("Hello Hello how are you you you are?"));
	}

}
