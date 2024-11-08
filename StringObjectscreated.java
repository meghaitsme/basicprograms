package basic.programs.java;

public class StringObjectscreated {
	//how many string objects are created 
	public static void main(String[] args) {
		String s1 = "I am Java Expert";
		String s2 = "I am C Expert";
		String s3 = "I am Java Expert";

		StringObjectscreated ob1 = new StringObjectscreated();
		System.out.println(ob1.equals(s3)); //false

		System.out.println(s2.equals(s3)); //false
		System.out.println(s1.equals(s3)); //true

		/* in string pool, s1 is stored as 1 object
		 * s2 is stored in 1 object
		 * s3 value is same , hence it is stored with s1 , 
		 *  so , 2 objects are created .
		 * */

	}

}
