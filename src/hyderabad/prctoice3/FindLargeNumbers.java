package hyderabad.prctoice3;

public class FindLargeNumbers {

	public static void main(String[] args) {
		// find Large Number
		int a = 35;
		int b = 3;
		int c = 6;
		int value = a > b ? a : b;
		System.out.println(value);

		// for 3 integer numbers
		if (a > b && a > c) {
			System.out.println(a);
		} else if (b > c) {
			System.out.println(b);
		} else {
			System.out.println(c);
		}
	}

}
