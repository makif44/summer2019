package day17;

import java.util.Scanner;

public class warmUp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your name");
		String name= scan.nextLine();
		System.out.println("Please enter your lastname");
		String lastname= scan.nextLine();
		
		
		String fname= name.concat(" "+lastname);	
               fname=fname.toUpperCase();
		System.out.println("Fullname is "+fname);
		System.out.println("number of characters is "+fname.length());
		char ch=fname.charAt(20);
		System.out.println(ch);
	
	String n= 12+34+name+'w';
	System.out.println(n);
	
	}
}
