package day12;

public class SwichStatements {
public static void main(String[] args) {
	
	String str = "phayton";
	switch (str) {
	case "C#":
		System.out.println("C# prograaming Language");
		break;
	default:
		System.out.println("invalid");
		break;
	case "phayton":
		System.out.println("python programing language");
		break;
	
	}
	
	String days="Tuesday";
	
	switch ( days ){
		case  "Monday":
			System.out.println("Monday is fun day");
			break;
		case "Tuesday":
			System.out.println("Tuesday is great day");
			break;
		default:
			System.out.println("invalid");
			break;
		case "wednesday":
			System.out.println("Wednesday is of day");
			break;
		
		
	}
	
	int num= 5;
	switch (num) {
	case 7:
		System.out.println("sunday");
		break;
	default:
		System.out.println("Invalid entery");
		break;
	case 5:
		System.out.println("friday");
		break;
		
	}
	
	
	char grade='A';
	switch (grade) {
	case 'A':
	case 'B':
		System.out.println("passed the exam");
		break;
	default:
		System.out.println("failed the exam");
		
	}
		System.out.println("================");
	
	String US ="USaA";
	switch (US) {
	case "US":
	case "USA":
	case "America":
		System.out.println("American");
		break;
	default:
		System.out.println("Not American");
		break;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
}
