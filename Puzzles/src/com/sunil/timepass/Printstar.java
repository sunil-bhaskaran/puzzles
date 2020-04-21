package com.sunil.timepass;

import java.util.Scanner;

public class Printstar {
	
	public void printStarData(int number)
	{
		for (int i=1; i <= number; i++)
		{
			for (int j=1; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
		System.out.println("Enter the number and press Enter.");
		Scanner sc = new Scanner(System.in);
		String number = sc.nextLine();
		int	num = Integer.parseInt(number);
		Printstar obj = new Printstar();
		obj.printStarData(num);
		}
		catch (Exception e)
		{
			System.out.println("Enter ONLY a number and press Enter!!");
		}

	}

}
