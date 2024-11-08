package basic.programs.java;

public class Seperatenumber {

	public static void descending()
	{//input   logic    output 
		int i = 123; //ascending 
		for(int num = 1; num < 4;num++)
		{
			//System.out.println(i%10); //321
			//System.out.print(i%10); //321
			System.out.print(i/10); //321 removes last number 
			System.out.print(i/10); //121212121212

			--i; //descending 
		}	
	}
	public static void main(String[] args) {
	descending();
		// retrive last number -> % modulo opeartor 
		//remove the last number -> /
		
		//print 123 as   3   2   1 
		//print numbers in descending order 
	/*	int num= 123;
		for(int i=1; i < 20; i++) //start , till , inc 
		{
			System.out.print(num%10);
			--num;
		} */
	}
}
