package day12;

public class warm_up {
	public static void main(String[] args) {
		int n1=9,n2=4,n3=9;
		
		if(n1==n2&&n1!=n3) {
			System.out.println("n1 and n2 are equal");
		}else if (n1==n3&&n1!=n2) {
			System.out.println("n1 and n3 are equal");
		}else if (n2==n3&&n2!=n1) {
			System.out.println("n2 and n3 are equal");
		}else if (n2==n3&&n1==n2) {
			System.out.println("all equal");
		}else {
			System.out.println("none of them are equal");
		}
	}

}
