package day08_ShortHandOperators;

public class ShortHand {
	public static void main(String[] args) {
		int a=9;
		
		a+=3;
		System.out.println(a);
		
		int b =a+=5;
		System.out.println(b);
	
		int c = a+= b;
		System.out.println(c);
		System.out.println(a);
		System.out.println(b);
	
	    int d =a += c;
	    System.out.println(d);
	    
	    int e= (d+=b)*2;
	     System.out.println(e);//170
	     System.out.println(d);//85
	     System.out.println(c);//34
	     System.out.println(b);//17
	     System.out.println(a);//68
	     
	     int f = b+=d*2;
	     System.out.println(f);//f=b=187
	     System.out.println(b);
	     
	     
	     int g = 101;
	     int h = g-=1; // g=h=100
	     
	     
	     int i= g+=h+5;
	     System.out.println(i);
	     System.out.println(g);
	      int j = h+=g%i;
	      System.out.println(j);
	      
	      
	      
	      System.out.println(-100%3);
	      
	      int J =300;
	     int K =10;
	     J+=J%=K;
	     	System.out.println(J);
	     
	
	
	
	}
}
