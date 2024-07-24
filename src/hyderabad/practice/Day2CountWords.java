package hyderabad.practice;

public class Day2CountWords {

	public static void main(String[] args) {
		String str = "am ready do anything you want";
		String[] data = str.split(" ");
		int count = 0;
		for (int i = 0; i < data.length; i++) {
			count++;
		}
		System.out.println("total words : " + count);

	}
}
