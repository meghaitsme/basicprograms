package basic.programs.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* OOPS :-    Inheritance , 
 * 
 *  HashSet is a class that implements set interface.
 * obtained from java.util 
 * Hashset is declared as
 * data stored in the set accepts unique values , duplicate value not allowed  
 * set can accept only 1 null value 
 * elements in the set are stored  in unordered fashion- hashing, no support for index
 * it accepts heterogeneous type of data.
 * 
 * 
 * convert the HashSet to Arraylist -> acquire the features 
 * 
 * */

public class HashSetInterview {

	
	public static void main(String[] args) {
		
		//declaration:-
		HashSet setvalue = new HashSet();
		//alueHashSet<String> setv = new HashSet<String>();
		
		setvalue.add("Welcome");
		setvalue.add(100);//duplicate , returns only 1time 
		setvalue.add(100);//duplicate
		setvalue.add(true);
		setvalue.add(null); //multiple null value , returns only 1 time 
		setvalue.add(null);//multiple null value 
		setvalue.add("java");
		setvalue.add("collections");
		
		System.out.println(setvalue);
// [null, java, 100, collections, Welcome, true]
		System.out.println(setvalue.size()); // 6 , it doesnot count duplicates 
		
		setvalue.add("hashset");
		setvalue.add("arraylist");
		System.out.println("values in the set "+ setvalue.size()); // 8
		System.out.println(setvalue);
		//[null, java, 100, collections, hashset, Welcome, arraylist, true]
		
		// remove 
		setvalue.remove("Welcome"); // uppercase , lowercase preferred
		System.out.println(setvalue.size()); // 7
		System.out.println(setvalue );
		//[null, java, 100, collections, hashset, arraylist, true]
		
		//inserting element in between - index -not possible 
		
		//Accessing/retrieving speccific element in set element 
		// we cannot extract specific value, however there is a work around 
		// by converting the hashset to arraylist 
		
		ArrayList convttoal = new ArrayList(setvalue);//converted to ArrayList
		System.out.println(convttoal.get(0)); //null 
	//ArrayList indexing is possible 
		
		System.out.println("removed " + convttoal.remove(6)); //true , removed 
		System.out.println(convttoal.getLast());//arraylist
		System.out.println("elements present " +convttoal);
		//elements present [null, java, 100, collections, hashset, arraylist]
		System.out.println(convttoal.get(3));//collections
		
		Iterator iterate = convttoal.iterator();
		while(iterate.hasNext()) {
			System.out.println("Through iterator "+ iterate.next());
		}
		/*Through terator null
Through terator java
Through terator 100
Through terator collections
Through terator hashset
Through terator arraylist
		 * */
	
		for(Object x:convttoal) {
		System.out.println("Through for each loop "+ x);	
		}
		/*Through for each loop null
Through for each loop java
Through for each loop 100
Through for each loop collections
Through for each loop hashset
Through for each loop arraylist
		 */
		for(int i=0; i <convttoal.size(); i++ ) {
			System.out.println(convttoal.get(i) + ""+setvalue );
		}
		/*null[null, java, 100, collections, hashset, arraylist, true]
java[null, java, 100, collections, hashset, arraylist, true]
100[null, java, 100, collections, hashset, arraylist, true]
collections[null, java, 100, collections, hashset, arraylist, true]
hashset[null, java, 100, collections, hashset, arraylist, true]
arraylist[null, java, 100, collections, hashset, arraylist, true]
true[null, java, 100, collections, hashset, arraylist, true]
		  */
		
		
		
		setvalue.clear();
		 System.out.println(setvalue.isEmpty());// true
		 System.out.println(setvalue); //[]
		
	}

}
