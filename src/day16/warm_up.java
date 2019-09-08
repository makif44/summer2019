package day16;

import java.util.Scanner;

import day14.ScannerClass;

public class warm_up {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Please enter your name");
		 String firstname = scan.nextLine(),
				 lastname= scan.nextLine();
		 
		 String fullname= firstname.concat(" "+lastname);
		 	fullname= fullname.toUpperCase();
		 	
		 	System.out.println("Your fullname is : "+fullname);
	}

}
