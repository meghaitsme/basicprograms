package basic.programs.java;

public class IfControlStatements
{
	public static void main(String[] args)
	{
		IfControlStatements obj = new IfControlStatements();

		obj.CheckPositiveNumber();
		obj.TernaryOperator();
		obj.EvenOdd();
		obj.LeapYear();
		obj.isEmpty();
		obj.VowelConsonent();
		//	obj.infiniteloop();

	}
	//***********************************************************************




	/*public void infiniteloop()
{
	for(;;)
{

}
}
	 */
	//=============================================================
	public void VowelConsonent()
	{
		char ch = 'T';  // i/p :- 'A' is a vowel or consonent
		if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e'|| ch == 'i' || ch == 'o' || ch == 'u')
		{
			System.out.println(ch + " "+ "Vowels ");
		}
		else
		{
			System.out.println(ch + " "+ "consonent "); //executed
		}

		this.isEmpty();
	}
	//====================================================================
	public void isEmpty()
	{
		String s = "helo juliets";
		if(s.isEmpty())
		{
			System.out.println("String is empty");
		}
		else
		{
			System.out.println("String is present ");
		} //string is presnt executed
	}


	/*366 days leap year ,
	 * leap year exactly divisible by 4 except century year
	 * if it is a century year, perfectly divisible by 400
	 * year % 4 == 0
	 * year % 100 == 0
	 * year % 400 == 0
	 *  */
	public void LeapYear()
	{
		int year = 1995; //not leap year
		if(year % 4 == 0)
		{
			if(year % 100 == 0)
			{
				if(year % 400 == 0)
				{
					System.out.println(year + " is a leap year ");
				}
				else
				{
					System.out.println(year + " is not a leap year ");
				}
			}
			else
			{
				System.out.println(year + " is a leap year ");
			}
		}
		else
		{
			System.out.println(year + " not a leap year ");
		}
	}

	public void EvenOdd()
	{
		int value = 45;
		if(value%2 == 0)
		{
			System.out.println("Number is Even");
		}
		else
		{
			System.out.println("Number is Odd");
		}
	}



	//not constructor, non static , return type , method
	public void CheckPositiveNumber()
	{
		//to check number is positive.   +   -   0
		int number = -8; //Local variable,primitive datatype, no obj, number is +ve
		if(number > 0) // condn is true, enter into the block
		{
			System.out.println("Number is Positive");
		} //not provided any output becoz it is -ve
		else
		{
			System.out.println("Number is negative"); //executed
		}
	}

	public void TernaryOperator()
	{
		int num = 65;
		String ans = (num > 0) ? "Positive number " : "Negative number";
		System.out.println(ans); //positive number
	}


}
