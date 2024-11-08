package basic.programs.java;

public class VariablesDatatypes
{
   static int idefaultvalue;
   static float fdefaultvalue;
   static  byte bdefaultvalue;
   static  char cdefaultvalue;
   static boolean boodefaultvalue; 
    
	public static void main(String[] args) {
		try {
			System.out.println("int" +idefaultvalue);//int0
			System.out.println("float" +fdefaultvalue);//float0.0
			System.out.println("byte" +bdefaultvalue);//byte0
			System.out.println("char" +cdefaultvalue);//char
			System.out.println("boolean" +boodefaultvalue);//false
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
