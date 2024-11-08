package basic.programs.java;

import java.util.Scanner;

public class PrimeNumber 
{
	@SuppressWarnings("resource")
	public static int  method()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number ");
		int value = in.nextInt();
		
		for(int i=1; i < value/2; i++)
		{
			if(value %2 == 0)
			{
				System.out.println("number is prime");
			return i; //if return statement is executed then it will 
			//exit from the method,and it wont execute further, transfer back to the calling method
			}
			else
			{
				System.out.println("number not a prime");
				return i;
			}
		}
		return 0;
	}
	
	public static void main(String[] args)
	{
		method();	
	}

}
