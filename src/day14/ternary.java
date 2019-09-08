package day14;

public class ternary {

	public static void main(String[] args) {
		
		/*if (true) {
			num=100;
			
		}else {
			num=50;
		}
		System.out.println(num);
		*/
		int n = (false) ? 100 : 50 ;
		System.out.println(n);
		
		boolean batch12=3<2;
		System.out.println(batch12?"cybertek":"invalid");
		String bestschool= batch12?"cybertek":"invalid";
		
		System.out.println( bestschool);
		
		double interestRate = 0;
	 
		boolean  GoodCredit =true;
		interestRate= GoodCredit ? 0.5: 0.8;
           System.out.println(interestRate);	
           
       char finals =' ';
       int grade=167;
       finals= (grade>=90&&grade<=100) ? 'A'
    		   :(grade>=80&&grade<90) ? 'B'
    			:(grade>=70&&grade<80) ?  'C'
    			  :(grade>=60&&grade<70) ? 'D'
    				:(grade>=0&&grade<60) ? 'F'
    				  :' ';
       System.out.println(finals);
       
       
       
       int n1=100, n2=300, n3=400;
       
       int max= (n1>n2&&n1>n3) ? n1
    		     :(n2>n1&&n2>n3) ? n2
    		       :n3;
       System.out.println(max);
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
	}
	
}
