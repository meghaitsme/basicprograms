package basic.programs.java;

public class StringImmutable
{
	public static void main(String[] args) 
	{

		String s1 = "Value one ";
		//change the value, a new object is created 
		s1 = "value two ";
		System.out.println(s1); //value two
	}

}
