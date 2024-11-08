package basic.programs.java;

public class Loops
{
	public static void main(String[] args)
	{
		Loops ref = new Loops();
		ref.dowhile(); //-> better to use dowhile, iteration not fixed -> scaling users
		ref.whileloop(); //-> use while loop iteration is fixed
		ref.foreachloop();
	}

	public void foreachloop()//traverse the array, access each element
	{
		Object each[] = {"Hello", "Java","how are you", "selenium"};
		for(Object loop : each)
		{
			System.out.println(loop);
		}
	}

	public void whileloop()
	{ // 5 to 10  -> number of iteration is fixed
		int i = 5;
		while(i<= 10)  // 6 is not getting printed here, put break
		{
			System.out.println(i); //5
			while(i == 5)   //5 == 5
			{
				System.out.println(i);
				//if i remove it will go to infinite loop
				break;
			}
			i++;
		}
	}

	public void dowhile()
	{ //if the number of iteration not fixed ,then use do while loop.
		//print 20 to 40
		int i = 20;
		do {
			System.out.println(i);
			i++;
		}while(i<=40);
	}
}
