package day02_variables;

public class println_vs_print {
	
	// the only characters we can give for any name is: _ and $
	
	public static void main(String[] args) {
		System.out.println("hello cyberteck"); // print from a new line
		System.out.println("school");
		
		System.out.println("=========================");
		
		System.out.print("hello cyberteck ");
		System.out.print("school"); // printing takes places from where it's left off
		System.out.println();
	
		System.out.println("=========================");
        System.out.println("today is ");
        System.out.print("great day ");
	}

}
