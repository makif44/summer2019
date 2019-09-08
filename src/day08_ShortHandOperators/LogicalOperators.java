package day08_ShortHandOperators;

public class LogicalOperators {
public static void main(String[] args) {
	boolean C = !(8 > 5)  ||  !("Today" != "friday");
	//      	!true     ||  !true
	//			false     ||   false
		System.out.println(C);
		boolean D = true && true || false ;	
		//				true   ||  false
		System.out.println( D );
	int aa='9';
		System.out.println(aa);
}
}
