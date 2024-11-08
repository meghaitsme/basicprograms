package basic.programs.java;

public class EvenOrOdd {

	//Note :- 1. without increment it will go into infinite loop 
	public static void main(String[] args) {	
		//1. print all numbers 1 to 10 
		int i=1; //while loop , initialization
		while(i <= 10) //condition
		{
			//print 1 to 10 numbers  , statements
			System.out.println(i);
			i++; //++i it works , increment by 1 
		}  //loop get exited
		System.out.println("===============1======================");
		//2. for loop -> prints odd number -> only 1 incr 
		for(int j=1;j<=20;j++ ) //inc, if inc not given then it goes continu
		{
			System.out.println(j);
			j++; //without incrementing it will go to infinite loop
		}
		System.out.println("===============2======================");
		//3. print even numbers -> incr of 2 
		int e = 2; //initialization
		while(e <= 10) //condition
		{
			//statement
			System.out.println("even" + e);//even , so 2   4   6 inc of 2 
			e= e+2; //inc of 2 
		} 
		
		System.out.println("===============3======================");
		//4. print only when it is even number 
		int oe =2;
		while(oe<=10)
		{
			if(oe%2 == 0)
			{
				System.out.println("only even " +oe);
			}
			oe = oe+2;

		} 
		System.out.println("===============4======================");
		//5. Prnt hello message 10 times 
		int k = 1; //initialize
		while(k <= 10) //condition
		{
			System.out.println("Hello"); //statement 
			k++; //inc or dec
		}
		System.out.println("=====================================");

		
	}

}
