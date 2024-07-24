package hyderabad.practice;

import java.util.HashMap;
import java.util.Map;

public class Day1getCharCount {

	public static void getCharCount(String name) {
 
		name=name.replaceAll(" ", "");
		Map<Character, Integer> charValue = new HashMap<Character, Integer>();
		char StringArray[] = name.toCharArray();

		for (char c : StringArray) {
			
			if (charValue.containsKey(c)) {
				charValue.put(c, charValue.get(c) + 1);
			} else {
				charValue.put(c, 1);

			}
		}
		System.out.println(charValue);
		
		//Method 2
		for(Map.Entry<Character, Integer> entry : charValue.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}

	public static void main(String[] args) {

		getCharCount("testing java ");
//		getCharCount("");
//		getCharCount("test test");
//		getCharCount("121");

	}

}
