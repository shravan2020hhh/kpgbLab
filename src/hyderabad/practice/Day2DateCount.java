package hyderabad.practice;

public class Day2DateCount {

	public static void main(String[] args) {
		int month = 11;

		if (month == 1) {
			System.out.println("31");
		} else if (month == 3) {
			System.out.println("31");
		} else if (month == 2) {
			System.out.println("28/29");
		} else if (month == 4) {
			System.out.println("30");
		} else if (month == 5) {
			System.out.println("31");
		} else {
			System.out.println("enter valid month");
		}

		switch (month) {
		case 1:
			System.out.println("31");
			break;
		case 6:
			System.out.println("30");
			break;
		case 2:
			System.out.println("28/29");
			break;
		case 3:
			System.out.println("31");
			break;
		case 5:
			System.out.println("31");
			break;
		}
		
		
		switch (month) {
		case 1:
		case 3:
		case 5:
			System.out.println("31");
			break;
			
		case 2:
			System.out.println("28/29");
			break;
			
		case 4:
		case 9:
		case 11:
			System.out.println("30");
			break;
		}
	}

}
