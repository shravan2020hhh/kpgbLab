package hyderabad.practice;

public class Day6ReplaceSpacialCharacters {

	public static void main(String[] args) {
		String s1 = "sdjhjdf 23847234 !@#$%$%^^&";
		String s2 = "2434324 !@T@^ sravan";

		s1 = s1.replaceAll("[^a-zA-Z0-9]", "L");
		s2 = s2.replaceAll("[a-zA-Z0-9]", "K");

		System.out.println("replced spacial char: "+s1);
		System.out.println("replced numerical_number: "+s2);

//		String s1 = "!@#$%$%^^&";
//		if(s1.matches("[^a-zA-Z0-9]+")) {
//			System.out.println("succes");
//		}else {
//			System.out.println("fail");
//		}
	}

}
