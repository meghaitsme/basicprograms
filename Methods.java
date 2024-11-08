package basic.programs.java;


class Methods {
	 int num = 12345; //12345
	 int countnum = 5463783;
	 int revi = 0 ;
	 String ar = "";
	 int temp, a=10, b=30;
	 String br = "Software testing material";
	 int rev= 0,rem;
	 int count = 0;

	//logic
	public void swap(){ // a, b, temp
		temp = a;
		a= b;
		b= temp;
	}

	 void  ReverseNumber(){ // revi , num
		revi = revi*10 + num%10;
		num = num/10;
	}

	void ReverseString(int i) {	 //br , ar
		ar = br.charAt(i) + ar;
	}


	void palindromenew(int value) {
		while (value != 0) 
		{
			rem= value%10;
			rev = rev*10+rem;
			value= value/10;

			//       revi = revi*10 + temparoryvar%10; , but we need divisor value, and compare 
			//     temparoryvar = temparoryvar/10;
			 if(value == rev) {
		        	System.out.println(value +"palindrome "+rev);
		        }
		        else
		        {
		        	System.out.println(value +"not palindrome "+rev);

		        }

		}
	}

	
	void counttotalnumbers() { // countnum, count
		countnum = countnum/10; //elemintae the last digit, immedaiately count that numver 
		count++;
	}
	

}

