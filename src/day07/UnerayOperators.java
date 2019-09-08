package day07;

public class UnerayOperators {
	public static void main(String[] args) {
		System.out.println(12.8/3l);
		System.out.println(10%3.5);
		
		int a = 10;
		int b = -10;		
		System.out.println(a+++--a + ++a + a++);
		System.out.println(a-- - --a + a );
	           
		System.out.println(a);
		int x=100;
		int y= x++-1;
		System.out.println(y);
		System.out.println(x-y);
		
		
		short Snum=4;
		int R = Snum*4-Snum--;
		System.out.println(R);
		System.out.println(Snum);
		System.out.println(--R);
		
		int w=1;
		w = - w-- + w++ /-w-- *--w;
		System.out.println(w);
	
	
	
	
	
	}
}
