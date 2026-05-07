package Enum_pract;

enum Day {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY }

public class Enum_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Day day=Day.MONDAY;
		System.out.println(day);
		switch(day) {
		case MONDAY: System.out.println("Monday"); break;
		case TUESDAY: System.out.println("Tuesday"); break;
		case WEDNESDAY: System.out.println("Wednesday"); break;
		case THURSDAY: System.out.println("Thursday"); break;
//		case MONDAY: System.out.println("Monday"); break;
		}

	}

}
