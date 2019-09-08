package day15;

public class warmup {
public static void main(String[] args) {
	int num=7;
	String result= num==9? "nine"
		  :num==8 ?"eight"
		    :num==7 ? "seven"
		      :num==6 ? "six"
		        :num==5 ? "five"
		          :num==4 ? "four"
		            :num==3 ? "three"
		              :num==2 ? "two"
		                :num==1 ? "one"
		                  :num==0 ?"zero":"invalid";
	System.out.println(result);
}
}
