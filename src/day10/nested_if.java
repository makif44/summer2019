package day10;

public class nested_if {
	public static void main(String[] args) {
		int grade=47;
		
		if(grade>=0&&grade<=100) {   
		
			
			if(grade>=60&&grade<=100) {
			System.out.println("passed");
			
				if (grade>=90 &&grade<=100) {
					System.out.println("\twith a grade of A");
				
				}
				else if(grade>=80&&grade<90) {
					System.out.println("\twith a grade of B");
				}
				else if(grade>=70&&grade<80) {
					System.out.println("\twith a grade of C");
				}
				else if(grade>=60&&grade<70) {
					System.out.println("\twith a grade of D");
		        }
			}
			else {
			System.out.println("faild");
		
	        }        
	
		}
		else  { System.out.println("404");	
		}

	
	
	
	
	
	
	
	
	
	
	}

}
