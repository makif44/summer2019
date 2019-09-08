package firstmonth;

public class Task04_HTTPS {

		public static void main(String[] args) {
			
			int Status_Code =503;
			
			if (Status_Code==200) {
				System.out.println(" OK");
			}
			
			if (Status_Code==201) {
				System.out.println(" Created");
			}
			
			if (Status_Code==202) {
				System.out.println(" Accepted");
			}
			
			if (Status_Code==301) {
				System.out.println(" Moved Permanently");
			}
			
			
			if (Status_Code==303) {
				System.out.println(" See Other");
			}
			
			if (Status_Code==304) {
				System.out.println(" Not Modified");
			}
			
			if (Status_Code==307) {
				System.out.println(" Temporary Redirect");
			}
			
			if (Status_Code==400) {
				System.out.println(" Bed Request");
			}
			
			if (Status_Code==401) {
				System.out.println(" Unauthorized");
			}
			
			if (Status_Code==403) {
				System.out.println(" Forbidden");
			}
			
			if (Status_Code==404) {
				System.out.println(" Not Found");
			}
			
			if (Status_Code==410) {
				System.out.println(" Gone");
			}
			
			if (Status_Code==500) {
				System.out.println(" Internal Server Error");
			}
			
			if (Status_Code==503) {
				System.out.println(" Service Unavailable");
			}
			
			
		}
}
