package basic.programs.java;

public class removewhitespaceString {

	static void count(String countnoofchar){
		
		char[] ch = countnoofchar.toCharArray();
		
		for(int i=0; i < ch.length ; i++) {
			String s = " ";
			while(i < ch.length && ch[i] != ' ') {
				s = s+ ch[i];
				i++;
			}	
			if(s.length() > 0) {
				System.out.println(s + "->" + s.length());
			}
		}
	}
	public static void main(String[] args) {
		
		String countnoofchar = "Hello janu cometell you something ";
		count(countnoofchar);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		String s = "hello world java    selenium";
		String s1 = s.replaceAll("\\s",""); // store them in diff variable else, gives same output 
		System.out.println(s1);
		//helloworldjavaselenium

		
		String ov = "method overloading same class different parameters ";
		String av = ov.replaceAll("\\s", "");
		System.out.println(av); 
		//methodoverloadingsameclassdifferentparameters
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
