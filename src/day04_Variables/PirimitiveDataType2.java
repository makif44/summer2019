package day04_Variables;

public class PirimitiveDataType2 {

	/* boolean : takes only true or false
	 
	  char
	 * 
	 
	  
	 
	 */
	
	public static void main(String[] args) {
		boolean result = true;
		boolean result2 = false;
		boolean result3 = 9>3;
		


		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		
		char char1 = 'a';
		System.out.println(char1);
		
		char char2 = '7';
		char char3 = '#';   
		char char4 = 65, char5 = 177;
		char char6 = ';',char7 =123, char8 ='A';
		System.out.println("=================");
		
		System.out.println(char2);
		
		System.out.println(char4);
		
		System.out.println(char5);
		 
		System.out.println(char6);
		
		System.out.println(char7);
		
		System.out.println(char8);
		
		System.out.println("=-=-=-=-=-=--=-=");
     //       initializing char to other primitives : byte short int long float double		
		char MyChar1 ='b';
		int MyInt = 'b';
		
		System.out.println(MyChar1);
		
		System.out.println(MyInt);
	    
	//          byte MyByte = MyChar1; 
		
		byte MyByte2 = 'b';
		
		System.out.println(MyByte2);
		
	//    short ShortNum = Mychar1; char's memory is could be bigger than short
		short ShortNum2 =  'b';
		System.out.println(ShortNum2);
		
		long LongNum = MyChar1; // long's memory is 8 byte
		long LongNum2 = 'b'; //98
		
		System.out.println(LongNum);
		
		float floatNum = MyChar1;
		float floatNum2  = 'b';
		System.out.println(floatNum2); // 98.0

		double doubleNum = MyChar1;
		double doubleNum2 = 'b';
		System.out.println(doubleNum2); //98.0
		
		// java is case sensitive  a does not equel A
		
		char mycharValue =2222;
		System.out.println( mycharValue);
		
		
		
		
		
		
		
		
		
		}
}
