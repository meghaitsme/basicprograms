package basic.programs.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*Hash map :- Hash map stores the element in Key and value pair , 
 * where they are tightly coupled as key is associated with value .
 * Key can be unique , and value can accept duplicates.
 * Key values are not stored with indexing.
*/

public class HashMapInterviewDemo {

	@SuppressWarnings({ "rawtypes", "unused" })
	public static void main(String[] args) {

		//declaration
		HashMap map = new HashMap();
		Map mymap = new HashMap(); //any type of data can be stored 
		
		// Key -> Integer value , Value -> String type
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		//method overloading 
		hm.put(101, "Adams");
		hm.put(103, "scott");//oldvalue is replaced.
		hm.put(101, "Mary"); // takes latest value.(old updated with new) key is unique
		hm.put(104, "david");// value can be duplicate 
		hm.put(105, "david ");
		hm.put(106, null);
		
		System.out.println(hm); //representing pairs in form of list 
		//{101=Mary, 103=scott, 104=david, 105=david }
		
		System.out.println("no of pairs "+ hm.size()); // 4 
		
		//remove pair :-
		hm.remove(103);  // 103 = scott 
		System.out.println("pairs "+ hm);// pairs {101=Mary, 104=david, 105=david }
		hm.remove(104,"david"); //  old value is removed , 105 is new 
		System.out.println("pairs "+ hm);//pairs {101=Mary, 105=david }
		System.out.println("no of pairs " + hm.size());
		
		System.out.println(hm.get(104)); //null
		System.out.println(hm.get(105));//david
		
		//print all keys 
		System.out.println("returns only keys" +hm.keySet());//[101, 105] returns keys
		System.out.println("returns only values" + hm.values());//[Mary, david ]retirns values 
		System.out.println("Keys are " +hm.keySet() + "values are "+ hm.values());
		//Keys are [101, 105, 106]values are [Mary, david , null]
		System.out.println("Kays and values are :" + hm.entrySet());
		//Keys and values are :[101=Mary, 105=david , 106=null] set 
		
		
		for (int readindividualkey : hm.keySet()) {
			System.out.println(readindividualkey +"  "+ hm.get(readindividualkey));
		}
		/*	101 Mary
			105 david 
			106 null
		 */
		
		
	}

}
