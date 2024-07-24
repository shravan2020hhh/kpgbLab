package hyderabad.practice;

import java.util.LinkedHashSet;

public class Eday12RemoveDuplicates {

	// Using LinkedHashSet--this function remove duplicate characters from string
	static void removeDuplicates(String str) {
		LinkedHashSet<Character> value = new LinkedHashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			value.add(str.charAt(i));
		}
		System.out.println(value);// will get char array value

		// print string after deleting duplicate elements
		for (char c : value) {
			System.out.print(c);
		}
	}

	// Driver program to test removeDuplicates
	public static void main(String[] args) {
		// without static keyword
		String str = "sravanmetuku";
		Eday12RemoveDuplicates rd = new Eday12RemoveDuplicates();
		rd.removeDuplicates(str);

		removeDuplicates("adsasdf");// need static modifier for this
	}
}
