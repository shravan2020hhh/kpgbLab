package hyderabad.practice;

public class Day5DuplicateChar {

	public static void main(String[] args) {
		// Duplicate Character

		String str = "maheshbabuu";
		int len = str.length();// storing only
		char[] duplicate = str.toCharArray();

		int count = 0;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (duplicate[i] == duplicate[j]) {
					System.out.println(duplicate[j]);
					count++;
				}
			}
		}
		System.out.println("result " + count);

	}
}