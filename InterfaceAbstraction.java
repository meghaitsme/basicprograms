package basic.programs.java;
/* Interface := fields can be final or static 
 * interface can have abstract methods and 
 * from java 8 ,default method and static method.
 *     Interface implements class 
 * abstract method signature , no implementation.
 *  */

interface shape{
	int length=10;
	int width=20;
	int a= 230;
	int b= 340;
	
	default void afterswapnumber(int a,int b,int temp){
	System.out.println("before swap A value is "+ a +""+b);// 120 230
			temp = a;
			a= b;
			b= temp;
	System.out.println("after swap A value is "+ a +""+b);//230 120
			return;
	}

	static void Reversenumber(int num, int rev) {
	//	num = 1234; rev = 0;
		while(num!=0) {
			rev = rev*10 + num%10;
			num= num/10;
		}
			System.out.println("rev number is "+ rev);
	}
	
	
	static void abstractmethod() { //bydefault , methods r public ,implement the unimplemented methods in class 
		System.out.println("Logic's , code reusablemthods are implemented in interface");
	}
	default double calulateperimeter(double side) { 
		return 4*side;
	}

	static double calculateArea(double side) {
		return side*side ;
	}

	default int square(int num) {
		return num*num;
	} 		
	default int triangle(int length,int width){
		return 1/2*length*width;
	}
}
//Shape is parent , class is Sub class 
public class InterfaceAbstraction implements shape {

	public static void main(String args[]) {
		//static method not accessible, if u use class objcet 
		InterfaceAbstraction classob = new InterfaceAbstraction();
		shape.abstractmethod(); //staticmethod accessed directly
		shape.calculateArea(23); //static method accessed directly
		classob.triangle(20,34);
		classob.square(20);
		classob.calulateperimeter(10);

		//shape cannot b instantiation , so Interface and class 
		shape obj = new InterfaceAbstraction();
		shape.abstractmethod(); // static methods accessed directly 
		obj.calulateperimeter(453); 
		obj.square(36);
		shape.Reversenumber(12234532, 0);//23543221
		//shape.length;
		//obj.width;
		obj.afterswapnumber(a, b, 0);
				System.out.println(shape.length * shape.width); // 200 variables 
		System.out.println(shape.calculateArea(23)); //52

		System.out.println(classob.square(20)); //400
		System.out.println(classob.calulateperimeter(10));//40.0
		System.out.println(classob.triangle(20,34)); //0

	}
}
