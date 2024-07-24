package hyderabad.practice;

import java.util.HashMap;
import java.util.Map;

public class EDay12OccuranceOfCharacters {

	 static void getCharCounting(String name) {
		Map<Character, Integer> charValue = new HashMap<Character, Integer>();
		char[] stringArray = name.toCharArray();
		for (char c : stringArray) {
			
			if (charValue.containsKey(c)) {
				charValue.put(c, charValue.get(c) + 1);
			} else {
				charValue.put(c, 1);
			}

		}
		System.out.println(charValue);
	}

	public static void main(String[] args) {
		getCharCounting("asjbkjasdk jas");
		getCharCounting("sravan metuku");

		
		/*//getchar count excluding spaces
		 * String s = "sadf asdf dfwksd asef"; String str = s.replace("\s", "");
		 * System.out.println(str); int count = 0; for(int i=0;i<str.length();i++) {
		 * count++; } System.out.println(count);
		 */

	}

}
