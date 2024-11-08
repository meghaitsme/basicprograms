package basic.programs.java;
/* Can class have multiple classes in single java file ?
 * 
 * a Single java file can have multiple classes .
 * however, java specification is that one of the class can be public,
 * and the classname match the filename .
 * java file can have multiple non public classes.
 * by default multiple classes are in private and accessible within the package.
 * 
 * 
 * To ensure that java code is organized and improve readability and maintainability
 * Eg :-     main(String[] args) it has public access modifier 
 * 
 * */
class TestCase1{
	void method1()
	{
		System.out.println("one of the class can be public,and the classname has the same name as\r\n"
				+ " * java file name. ");
	}
}

class Testcase2
{
	void method2()
	{
		System.out.println("can have multiple non public classes in a java file. ");
	}
}

public class MultipleClassesinsinglejavaclass 
{
	public static void main(String[] args) {
		Testcase2 tc = new Testcase2();
		tc.method2();
		
		TestCase1 tc1 = new TestCase1();
		tc1.method1();
	}

}
