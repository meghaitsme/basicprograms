package basic.programs.java;
/*how many .class files will be generated when multiple classes are present in a java file 
 * 
 * Java compiler generates .class file for each class defined in the java file.
 * regardless of public and non public classes.
 * 
 * Example :- Testcase1.java -> has 3 inner classes, as classA, classB, classC
 * compiler generates the Testcase1.class file, classA.class, classB.class, classc.class
 * files are generated.
 * */


class A{
	void method1()
	{
		System.out.println("A.class file is generated");
	}
}

class B
{
	void method2()
	{
		System.out.println("B.class file is generated");
	}
}
public class ClassFinalKeyword
{
	public static void main(String[] args) 
	{
		System.out.println("ClassFinalKeyword.class file generated");
		A ob = new A();
		ob.method1();
		
		B ob1 = new B();
		ob1.method2();
	}

}
