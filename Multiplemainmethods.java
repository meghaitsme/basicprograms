package basic.programs.java;
/* Can we have the main method in all the classes present in 
 * root level of the java file ?
 * 
 * each class can have main method such that,
 * however any 1 of the class is declared as a public 
 * and class name is same as file name
 * and user choice , which class to run 
 */
public class Multiplemainmethods  //nested inner class
{
	public static void main(String[] args) {
		System.out.println("main method 1");
	}

/*
class metD //select which class to run
{
	public static void main(String[] args)
	{
		System.out.println("main method 2 ");//executed 	
	}
} */
}