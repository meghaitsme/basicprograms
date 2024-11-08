package basic.programs.java;

import java.util.Scanner;

import jdk.internal.org.jline.utils.Log;

public class trycatchblock {

	String str ; 
	String st = "";
	public void trycatchblock(String str){ // method constructor 
		this.str = str;
	}
	
	public String  validateReverseString(String str) {
		try {   // reverse the string  :- heeloo world 
			//validation 
			for(int i=0; i <= str.length(); i++) {
				st = str.charAt(i) + st;
			}
		}
		catch(Exception e) {
			//error 
			//System.out.println("not reversed error message ");
		}
		return st;
	}
	public static void main(String[] args) {
	
		System.out.println("enter the string to reverse ");
		Scanner read = new Scanner(System.in);
		String str = read.nextLine();
		
		trycatchblock obj = new trycatchblock();
		String st = obj.validateReverseString(str);
		System.out.println("reverse string is "+ st);
				

	}

}
