package basic.programs.java;

public class EvenOdd {
//using while loop
	public static void main(String[] args) {
   // 1. print all 1 to 10 numbers 
		int i= 1;
		while(i <= 10)
		{
			System.out.println(i);
			i++;
		}
		System.out.println("=========1=================");
		
	//2. print hello 10 times
		int j= 1;
		while(j<= 10)
		{
			System.out.println("Hello");
			j++;
		}
		System.out.println("===========2================");
		
		
	//4. even numbers
		int o= 1;
		while(o<= 10)
		{
			if(o%2 == 0)
			{
			 //prints frm 2
			System.out.println(o);
			}
			else
			{
				System.out.println(o);
				o++;
			}
		}
	}

}
