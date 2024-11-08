package basic.programs.java;

public class MethodsMain extends Methods {


	String swapnumber() {
		swap();
		return ( a + " " + b);
	}

	int NumberReverse(){
		while(num!= 0) {
			ReverseNumber();
		}
		return revi;
	}

	String reverseStringvalue() {
		for(int i= 0; i < br.length();i++) {
			ReverseString(i);
		}
		return ar; 
	}

	void ispalindromenumber(int no) {
		int temparoryvar = no;
		int rev= 0,rem;

		// Reverse the number
		while (temparoryvar != 0) {
			rem= temparoryvar%10;
			rev = rev*10+rem;
			temparoryvar= temparoryvar/10;  
		}
		if(no == rev) {
			System.out.println(no +"palindrome "+rev);
		}
		else
		{
			System.out.println(no +"not palindrome "+rev);

		}
	}

	String ispalindromestring(String s) {

		String rev= "";

		// Reverse the number
		for(int i = 0; i < s.length();i++) {
			rev = s.charAt(i) + rev;
		}
		System.out.println("revresed string "+ rev);

		if(s.equals(rev)) {
			return (s +"palindrome" +rev);
		}
		else
		{
			return (s + "not palindrome" +rev);

		}
	}

	void countnoofdigits(){ //no params return value 
		while(countnum > 0)
		{
			counttotalnumbers() ;
		}
		System.out.println("total number of count "+ count);//total number of count 7
	}

	void evenodd(int number){// num= 12345

		int evencount=0,oddcount=0, remeo = 0 ;
		while(number > 0){
			remeo = number%10;
			if( remeo%2 == 0) {
				evencount++;
			}else {
				oddcount++;
			}
			number = number/10;
		}

		System.out.println("even count " + evencount);
		System.out.println("odd count " + oddcount);

	}


	public static void main(String[] args) {

		MethodsMain obj1 = new MethodsMain();
		System.out.println("swap number "+ obj1.swapnumber());//swap number 30 10
		System.out.println(obj1.NumberReverse());//54321
		System.out.println(obj1.reverseStringvalue());//lairetam gnitset erawtfoS

		obj1.ispalindromenumber(121);  // True
		obj1.ispalindromenumber(123);  // False
		obj1.ispalindromestring("people"); //revresed string elpoep
		obj1.ispalindromestring("madam");//revresed string madam
		obj1.countnoofdigits(); //7
		obj1.evenodd(1254634);// e = 4 , o= 3

	}

}
