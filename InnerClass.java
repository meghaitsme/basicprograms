package basic.programs.java;

/* 42.Can a class be a sub class and super class to another class at a same time?
 * Yes, Class can be both super class and sub class simultaneously in java
* This situation occurs when ,class is a part of hirarchy inheritance  
* where it inherits from sub class and at same time, 
* it is a super class to another class
* 
* inheritance enables the the subclass to reuse the code, of its super class
*/

// Example :- Super class -> Yes 
class Testclass1 
{
	void hello()
	{
		System.out.println("hello");
	}
}

//sub class of Testclass1 ,   Testclass2 Super class for Testclass3
class Testclass2 extends Testclass1
{       // at the same time 
	void eat()
	{
		System.out.println("Testclass2 ");
	}
}

//sub class of Testclass2 
class TestClass3 extends Testclass2
{
	void eat2()
	{
		System.out.println("Testclass3");
	}
}

//main method 
public class InnerClass 
{
	public static void main(String[] args) 
	{
		System.out.println("class in main method : class 1 ");
		Testclass1 obj = new Testclass1();
		obj.hello();
		Testclass2 obj2 = new Testclass2();
		obj2.eat();
		TestClass3 obj3 = new TestClass3();
		obj3.eat2();
		
	}
}