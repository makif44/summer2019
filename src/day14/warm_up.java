package day14;

public class warm_up {
	public static void main(String[] args) {
		String day="wednesday";
		
		switch(day) {
		case "monday":
		case "tuesday":	
			System.out.println("Java class day");
			break;
		case "thursday":
		case "friday":
			System.out.println("Selenium class day");
			break;
		case "wednesday":
		case "saturday":
			System.out.println("SQL class day");
			break;
		default:
			System.out.println("day off");
		}
		
		

		
		
		
		
	}

}
