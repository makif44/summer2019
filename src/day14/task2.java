package day14;

import java.util.Scanner;

public class task2 {
	public static void main(String[] args) {
		/*Write a program that determines the change to be dispensed from a vending
		machine. An item in the machine can cost between 25 cents and 1 dollar, in 5-cent
		increments (25, 30, 35, . . . , 90, 95, or 100), and the machine accepts only a single
		dollar bill to pay for the item.
		Input: 
		Enter price in cents: 95↵
		Output:
		Your change is 0 quarters, 0 dimes, and 1 nickels.
		Remember:
		1 quarter = 25 cents.
		1 dimes = 10 cents.
		1 nickels  = 5 cents.
		you will need to use assignment and shor hand operators for this task. Good luck (edited)
      */
		Scanner input= new Scanner(System.in);
	
		System.out.println("Please enter price");
		int price= input.nextInt();
		
	if (price>0 && price <=100 && price%5==0) {	
		int remain=(100-price);
		int remain2= remain%25;
		int remain3= remain2%10;
		int quater = (remain>=25)? (remain/25):0;
		int dimes = (remain2>=10)? (remain2/10):0;
		int nickels= (remain3>=5)? (remain3/5):0;
		System.out.println("Don't forget change");
		System.out.println(quater+"  quater\n"+dimes+"  dimes\n"+
				+nickels+"  nickels");
	  }
     else {
         System.out.println("You entered a wrong price");
     }
		
         
	}
}
