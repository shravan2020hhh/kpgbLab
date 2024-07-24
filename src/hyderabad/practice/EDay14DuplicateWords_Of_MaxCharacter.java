package hyderabad.practice;

import java.util.*;

public class EDay14DuplicateWords_Of_MaxCharacter {

	public static void main(String[] args) {
		String s = "my name varunjikk is shravan metuku metuku varunjikk";
		String str[] = s.split(" ");
		String longWord = "";
		int longWordLentgh = 0;
		//int longWordLentgh = 1000;//to find min length word

		Map<String,Integer> m = new HashMap<String,Integer>();
		for (int i = 0; i < str.length; i++) {
			// if (longWordLentgh > str[i].length()) {//to find min length word
			if (longWordLentgh < str[i].length()) {
				longWord = str[i];
				longWordLentgh = str[i].length();
			}

			if (m.get(str[i]) != null) {

				m.put(str[i], (int) m.get(str[i]) + 1);
			} else
				m.put(str[i], 1);

		}
		System.out.println(longWord + " values " + m.get(longWord));

	}
}
