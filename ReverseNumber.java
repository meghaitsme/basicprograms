package basic.programs.java;
import java.util.Scanner;
public class ReverseNumber
{
	//Interview questions  -> Approach 1
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner User = new Scanner(System.in);
		System.out.println("Enter the number to be reversed"); // 1 2 3 4

		int inputnum = User.nextInt(); // i/p :- 261295
		int rev =0;
		while(inputnum != 0) //iteration 1 != 0
		{
			rev = rev*10 + inputnum % 10; // 0* 10 + 1234%10 => 0 + 4 = 4
			inputnum = inputnum/10; // 1234/10 = 123
		}
		System.out.println(rev); //4321   , 592162

		// ====================================================================================
		String in = "Hello World ";
		String revs = "";
		for(int i = 0; i < in.length(); i++)
		{
			revs= in.charAt(i) + revs;
		}
		System.out.println(revs);// dlroW olleH
		//======================================================================================

		int First = 1, second = 2, next = 0;
		for(int  i=1; i <= 10; i++)
		{
			System.out.println(First);
			next = First + second ;
			First = second;
			second = next ;
		}
	}
}
