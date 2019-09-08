package day02_variables;

public class EscapeSequences {

	/*
	 \n or \r: starts from a new line
	 \t : horizantal tab
	 \\ : back slash
	 \' : prints single quote
	 \" : prints double quote
	 */
	public static void main(String[] args) {
		System.out.println("Hello Cybertek\nBatch 12 students");
		
		System.out.print("Tomorrow is off\n");
		System.out.print("True\r");
		System.out.print("False\n\n\n\n");
		
		System.out.println("\tClass starts tomorrow");
		
		System.out.println("\\makif");
		System.out.println("\'Java");
		System.out.println("Book is called \"Game of Throne\" ");
		
	}
}
