package day14;

import java.util.Scanner;
//Write a Java program to calculate total amount of sale based on the unit price and quantity of a product taken.
//User should be able to enter unit price and quantity.
//Then the program will perform calculations and display amounts.
//The discount rate is 10% for the quantity purchased between 100 and 120 units, and 15% for the quantity purchased greater than 120 units.
//If the quantity purchased is less than 100 units, the discount rate is 0%.
//See the example output as shown below:
//Input:
//Enter unit price: 25
//Enter quantity: 110
//Output:
//Grand Total: $ 2750.0
//Discount: 10%
//Discount applied: $ 275.0
//Total: $ 2475.0
public class task1 {
	public static void main(String[] args) {
	
	Scanner input= new Scanner(System.in);

	System.out.println("\tWelcome \nPlease enter unit price");
 int unitPrice= input.nextInt();
    System.out.println("Please enter quantity");
    
 int quantity= input.nextInt();
 int discount = (quantity<100)?0
		                :(quantity>=100&&quantity<120)? 10 :15;
	switch (discount) {
	case 0:
		System.out.println("If you buy "+(100-quantity)+
				" more, you get 10% discount.");
		break;
		
		
		//System.out.println("Would you like to buy some to get discount? y or n");
		
		/*boolean y=true;
		  if (y) {
			  Scanner input= new Scanner(System.in);

			System.out.println("Welcome please enter unit price");
			 int unitPrice= input.nextInt();
			    System.out.println("Please enter quantity");
			    
		 int quantity= input.nextInt();
     	 int discount = (quantity<100)?0
					                :(quantity>=100&&quantity<120)? 10 :15;
			*/		  
		
	case 10:
		System.out.println("\tCongratulations. \n You got 10% discount "
			+ "\n If you buy "+(120-quantity)+" more, you get 15% discount.");
		break;
	case 15:
		System.out.println("\tCongratulations. \n You got 15% discount.");
	default:
		break;
	}	                  
   
    
    System.out.println("\tTotal price :      " + (unitPrice*quantity)
    	+"$\n\tDiscount amount :  "+(discount*unitPrice*quantity/100)
        +"$\n\tTotal price :      "+((unitPrice*quantity)-(discount*unitPrice*quantity/100))+"$"); 

 
 
 
 
 
 
 
 
 
	} 
}
