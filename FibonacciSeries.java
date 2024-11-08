package basic.programs.java;

import java.util.Scanner;

public class FibonacciSeries 
{
	public static void main(String[] args) 
	{
		Scanner Userinput = new Scanner(System.in);//request to user 
		System.out.println("number of fibonacci series to be printed ?");
		
		int nextline = Userinput.nextInt();
		int firstterm = 1, secondterm= 2;
		
		for(int i=1; i <=nextline; ++i ) //condition pass , enter into loop
		{
			System.out.println("terms are" +firstterm);
			int nextterm = firstterm + secondterm;
			firstterm = secondterm;
			secondterm = nextterm;
		}

	}

}
