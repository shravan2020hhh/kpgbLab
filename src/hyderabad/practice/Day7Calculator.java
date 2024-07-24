package hyderabad.practice;

public class Day7Calculator {

	public static void main(String[] args) {

		int i = 10, j = 20;

		String operation = "j";

		switch (operation) {
		case "Mul":
			System.out.println(i * j);
			break;

		case "Add":
			System.out.println(i + j);
			break;

		case "Minus":
			System.out.println(i - j);
			break;

		case "Div":
			System.out.println(i % j);
			break;

		default:
			System.out.println("Enter valid value");
			break;

		}
	}

}
