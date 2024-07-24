package hyderabad.practice;

public class Day2RevArray {

	public static void main(String[] args) {

		String[] a = { "a", "r", "w", "r" };
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + ",");
		}
		System.out.println();
		int[] num = { 1, 4, 6, 3, 6 };
		for (int i = num.length - 1; i >= 0; i--) {
			System.out.print(num[i] + ",");
		}
	}

}
