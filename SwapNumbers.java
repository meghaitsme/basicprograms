package basic.programs.java;

public class SwapNumbers { 
	 int a = 56; //not assessible in class 
	
	public static void methodConstructorblock() //static call directly 
	//without creating object in main method 
	{
		//int sum= a+ b;
		int var1= 20; //Local var , no default value 
		int var2 = 40;
		System.out.println("before swap" +var1 +"variable2 value" +var2);
		int temp = var1;
		var1= var2;
		var2 = temp;
		System.out.println("After swap" +var1 +"variable2 value" +var2 );
	}

	public static void main(String[] args) 
	{	//System.out.println(a); static is not initiated, so not called 	
		methodConstructorblock();//static it is accessible without constructor.
		
		//*****initiate temp variable
		int a= 63, //Variables = integer
			b= 86; //variables r declared and accessible in 
		//method/constructor/blocks
		System.out.println("1Before swap a="+a + "b="+b );
		//output is printed in console
		
		int temp = a; //temp variable intiated 
		a= b; //variables = integer
		b= temp;
		System.out.println("1After swap a="+a + "b="+b );

		//*****using + and -
		System.out.println("2Before swap a="+a + "b="+b );
		a= a+b;
		b= a-b;
		a= a-b;
		System.out.println("2After swap a="+a + "b="+b );
		
		//*****single line expressions 
		System.out.println("3Before swap a="+a + "b="+b );
		b= (a+b) - (a=b);
		System.out.println("3After swap a="+a + "b="+b );
		
	}
}
