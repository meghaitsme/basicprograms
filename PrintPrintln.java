package basic.programs.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintPrintln
{

	public static void main(String[] args) throws NumberFormatException, IOException
	{
		System.out.print("hello world");
		System.out.println("automation"); //hello worldautomation, for next statement it will apply
		//System.out.print(); // doesnot work without argument
		System.out.println();// works without argument

		//print the text in the console
		//then text is said to be paramater to the Print method
		//cursor remains at the end of the text in the console .

		//System.in -> input stream reads the character in the keyboard
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number");
		Integer num = Integer.parseInt(in.readLine());
		System.out.println(num);

	//	Scanner
	}

}
