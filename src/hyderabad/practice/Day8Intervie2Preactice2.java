package hyderabad.practice;

public class Day8Intervie2Preactice2 {

	public static void main(String[] args) {
		// Sum of even numbers

		int res = 0;
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				res = res + i;
			}
		}
		System.out.println(res);

		// Print Zigzag
		int j = 10;
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			System.out.println(j);
			j--;
		}

		// Count num of digit
		int num = 23432;
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		System.out.println(count);
		// OR OR ----------------
		for (int i = 1; i <= num; i++) {
			num = num / 10;// 2343=1st count,234=2,23=3,2=4,0=5
			count++;
		}
		System.out.println(count);

		// seperat each digit
		int n1 = 0, n = 31232;
		while (n > 0) {
			System.out.println(n % 10);
			n = n / 10;
		}

		// find vowels
		char c = 'f';
		if (c == 'a' || c == 'e' || c == 'i' || c == 'u' || c == 'o') {
			System.out.println("vowel");
		} else {
			System.out.println("not vowel");
		}

	}

}
