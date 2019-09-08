package firstmonth;

public class Task03_BiggerNnumber {
 public static void main(String[] args) {
	
	 int n1 ,n2 , n3, nmax;
	 n1=312;
	 n2=112;
	 n3=421;
	 nmax=0;
	 if    (n2>n1  && n2>n3) {
		nmax=n2; 
	 }
	 
	 if    (n1>n2  && n1>n3) {
		nmax=n1;
	 }
	 
	 if    (n3>n2  && n3>n1) {
		nmax=n3;
	 }
	 
	 System.out.println(nmax+" is the biggest number");
	 
	 
	 
	 
}
}
