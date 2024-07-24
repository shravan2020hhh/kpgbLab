package hyderbadHostel;

import java.util.Scanner;

public class Day2 {

	public static void main(String[] args) {
		// Palindrome check
		String str = "madam";
		String res = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			res = res + str.charAt(i);
		}
		if (str.equals(res))
			System.out.println("palindrom");
		else
			System.out.println("not palindrom");

		// reverse number
		Scanner sc = new Scanner(System.in);
		// int num = sc.nextInt();
		int num = 546546;
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println(rev);

		// reverse character
		String s = "sravan";
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();

		// reverse array
		int[] arr = { 4, 55, 555, 96 };
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ,");
		}
		System.out.println();

		// reverse words
		String revWord = "i am sravan";
		String[] word = revWord.split(" ");
		for (int i = word.length - 1; i >= 0; i--) {
			System.out.print(word[i] + " ");
		}
		System.out.println();

		for (String words : word) {
			System.out.println(words);
		}

		// character count
		String value = "sdf ,  as a";
		int count = 0;
		for (int i = 0; i <= value.length() - 1; i++) {
			if (value.charAt(i) != ',' && value.charAt(i) != ' ') {
				count++;
			}

		}
		System.out.println(count);

		// count words
		String countWrd = "i am the guy who";
		int count1 = 0;
		String[] countWrd2 = countWrd.split(" ");
		for (int i = 0; i <= countWrd2.length - 1; i++) {
			count1++;
		}
		System.out.println(count1);

		// count and find duplicate characters
		String string = "maheshbabuu";
		int count2 = 0;
		char[] duplicate = string.toCharArray();
		for (int i = 1; i <= string.length() - 1; i++) {
			for (int j = i + 1; j <= string.length() - 1; j++) {
				if (duplicate[i] == duplicate[j]) {
					count2++;
					System.out.println("dupli " + duplicate[j]);

				}
			}

		}
		System.out.println(count2);

	}

}
