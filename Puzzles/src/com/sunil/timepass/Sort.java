package com.sunil.timepass;

public class Sort {
	
	public int[] sort(int[] array)
	{
		int len = array.length;
		int[] sortedArray = array;
		
		for (int i =0; i <=len - 1; i++)
		{
			for (int j = i+1; j <= len-1; j++)
			{
				if (sortedArray[i] > sortedArray[j])
				{
					System.out.println(sortedArray[j]);
					int temp = sortedArray[j];
					sortedArray[j] = sortedArray[i];
					sortedArray[i] = temp;
				}
								
			}
		}
		
		return sortedArray;
	}
	
	public static void main(String ags[])
	{
		Sort obj = new Sort();
		int[] array = {1,2,5,5,3};
		int[] sortarray = obj.sort(array);
		
	    //System.out.println(obj.sort(array));
	    
	    for (int i=0; i < sortarray.length; i++)
	    {
	    	System.out.print(sortarray[i]);
	    }
		
	}

}
