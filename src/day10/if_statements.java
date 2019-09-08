package day10;

public class if_statements {
public static void main(String[] args) {
	
	int grade=10;
	if(grade>=90&&grade<=100) {
		System.out.println("You made A");
	} else if (grade>=80&&grade<90){
		System.out.println("You made B");
	} else if (grade>=70&&grade<80) {
		System.out.println("You made C");
	}else if (grade>=60&&grade<70) {
		System.out.println("You made D");
	}else if (grade<60&&grade>=0) {
		System.out.println("failed");
	}else if (grade>100) {
		System.out.println("error");
	}else if (grade<0) {
		System.out.println("error");
	}
	}
}
