package day02_variables;

public class PrimativeDataType {
	/*
	 byte: we can assign whole numbers.   -128<=  byte <= 127
	 short : we can only assign whole  number. Must be with in -32768<=  short  <= 32767
	 int (used more often): we can only assign whole number. must be in 
	 long : we can only assign whole number
	  						at the end of value we can give l or L
	  						byte  < short < int < long
	  						small one can be assigned to large one 
	 float : we can assign decimal.
	 				(decimals must have f or F letter at end)
	 				
	double (used more often) : we can assign decimals.
	              float < double
	  
	 */
	public static void main(String[] args) {
		byte length = 3;
		System.out.println("length");
		
		byte widthandlenght = 4;
		System.out.println("width");
		
		// byte 9num=100;   variables names must start with a~z, or A~Z
		
		byte num_and$ = 90;
		// byte length =6; variable name is not unique
		
		// byte public = 10;  //variable names cannot be java reserved words
		
		// byte myNum1 = -129'; out of byte' range
		
		byte variableName = 127;
		 // short num2 = &; wecan only assign whole numbers
		// short num3 = 100000; out of range 
		
		int num4 = 10000000;
		
		long longNumber = 10;
				// int intNumber = 101;
		byte byteNumber = 10;
		short shortNumber = byteNumber;
		
	    short shortNumber2 =18;
	//	byte byteNumber2 = shortNUmber2;  shirt is greater than byte
		
		
		int intNumber = -9876;
		long longNumber2 = intNumber; // long is greater than int
	// left side of the = has to be equel or greater than the right side of =
		
		short shortNumber3 = -30000;
		short shortNumber4 = shortNumber3;
				System.out.println(shortNumber4);
				
	// int exampleNum1 = 10.5;
		 float exampleNum2 = 10.5f;
		 float exampleNum3 = 10.5F;
		 
		 double doubleNumber = 10.5;
		 
		 
		 
		 double doubleNumber2 = 30.5;
	//	float floatNumber   = doubleNumer2;  double datatype is larger than float datatype
		 System.out.println("==================================");
		 byte bNum =10;
		 short sNum =20;
		 int iNum = 30;
		 long lNum = 40;
		 System.out.println(bNum);
		 System.out.println(sNum);
		 System.out.println(iNum);
		 System.out.println(lNum);
		 
		 System.out.println("=================================");
		 
		 float fNum = bNum;
		 float fNum2 = sNum;
		 float fNum3 = iNum;
		 float fNum4 = lNum;
		 
		 System.out.println(fNum);
		 System.out.println(fNum2);
		 System.out.println(fNum3);
		 System.out.println(fNum4);
		 
		 System.out.println("=================================");
		 
		 double dNum = bNum;
		double dNum2 = sNum;
		double dNum3  = iNum;
		double dNum4 = lNum;
		System.out.println(dNum);
		System.out.println(dNum2);
		System.out.println(dNum3);
		System.out.println(dNum4);
		
		
		
		 
				 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
		
	
				
				

	
	}

}
