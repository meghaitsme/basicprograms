package basic.programs.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//overload method ex :- add() 

/* Arraylist is a class, Implements List interface.
 * obtain from java.util package.
 * Dynamic,no fixed size.
 * holds heterogenous type of data , also associated as homogenous type of data.
 * follows the indexing order of insertion.
 * enables to store duplicate values 
 * hold null value(unknown)  
 * */

public class ArrayListCollectionsMain {

	@SuppressWarnings({ "unchecked", "unused", "rawtypes" })
	public static void main(String[] args) {
		// Different ways of declaration
		
		//1. heteorogenous 2 ways 
		ArrayList hetero = new ArrayList();
		List hetero1 = new ArrayList();
		
		// 2. homogenous 
		ArrayList<Integer> homo = new ArrayList<Integer>();
		ArrayList<String> homostring = new ArrayList<String>();
		
		//3. class :- Employee class 
	//	ArrayList<Employee> classvalue = new ArrayList<Employee>();
		System.out.println(hetero.isEmpty()); //true
		
		//Add value 1.
		hetero.add(100);//adds the value at the end of the arraylist
		hetero.add(null); //adds the value at the end of the arraylist 
		hetero.add(null);

		hetero.clear(); // empty the list 
		System.out.println(hetero.isEmpty());
		hetero.add(100);//adds the value at the end of the arraylist
		hetero.add(null); //adds the value at the end of the arraylist 
		hetero.add(null);
		hetero.add(1, "Welcome"); // it adds value at speciifc position
		hetero.add(2, false);
		hetero.add(3,100);
		hetero.add(5, true);
		hetero.add(6, 'c');
		hetero.add(7,10.5);
		
		System.out.println("data stored in arraylist "+ hetero);
//data stored in arraylist [100, Welcome, false, 100, null, true, c, 10.5, null]
		System.out.println("total no of data stored in arrylist "+ hetero.size());
		//total no of data stored in arrylist 9
 
		
		//remove the valu efrom arraylist 
		hetero.remove(3);// 100 is duplicate 
		System.out.println("after Removed array list is "+ hetero + hetero.get(3));
		//after Removed array list is [100, Welcome, false, null, true, c, 10.5, null]null
	
		System.out.println(hetero.isEmpty()); //false , means present 
	
		hetero.set(5, "Automation");
		System.out.println("after Update: updated value "+ hetero.get(5));
		//after Update: updated value Automation
		//get() => access specifi element 
		//set() => update/change/modify the value 
		
		System.out.println("a[0] th value:" +hetero.getFirst());//a[0] th value:100
		System.out.println("a[lastvalue]:"+ hetero.getLast());//a[lastvalue]:null

		
		//read the value from the array 
		for(int i=0; i< hetero.size(); i++) {
			System.out.println(hetero.get(i));
		}
		/*100
		Welcome
		false
		null
		true
		Automation
		10.5
		null */
		
		for (Object x :hetero) { // used for collections 
			System.out.println("using for each loop "+x);
		}
		
		//specific to collections , Iterator 
		
		Iterator<Object> obj = hetero.iterator();
		System.out.println(obj.hasNext()); //true
		System.out.println(obj.next()); // 100

		while(obj.hasNext()) { // if it is true , enter into the loop 
			System.out.println("Using iterator :" +obj.next());
		}
		/*Using iterator :Welcome
		Using iterator :false
		Using iterator :null
		Using iterator :true
		Using iterator :Automation
		Using iterator :10.5
		Using iterator :null */
				
		// remove only 2 elements  from the arraylist
		ArrayList hetero2 = new ArrayList();
		hetero2.add(0,100);
		hetero2.add(1,"welcome");
		
		hetero.removeAll(hetero2);
		
		System.out.println(hetero);//[Welcome, false, null, true, Automation, 10.5, null]
		System.out.println(hetero2); //[100, welcome]

		
	
		
}
	}

