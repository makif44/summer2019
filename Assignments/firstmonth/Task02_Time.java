package firstmonth;

public class Task02_Time {
	public static void main(String[] args) {
		int hour,  minute, second;
		
		hour=23;
		minute=05;
		second=44;
		String str1 = "AM";
		String str2 = "PM";
		if(hour<0||hour>23) {
			System.out.println("error");
		}else if (minute<0||minute>59) {
			System.out.println("error");
		}else if (second<0||second>59) {
		    System.out.println("error");
		
		
		}else if (hour>=12) {
			System.out.println(hour+":"+minute+":"+second+" "+str2);
		}
		
		else if (hour<12) {
			System.out.println(hour+":"+minute+":"+second+" "+str1);
		}
		
		
	}

}
