package hyderbadHostel;

import java.util.HashSet;
import java.util.Set;

public class Day1 {
	// FInd duplicate words
	public static void main(String[] args) {

		String str = " java, selenium, java, python, python ";
		String[] str2 = str.trim().split(", ");
		//trim() will remove spaces after & before double quote("")
		Set sb = new HashSet();
		for (int i = 0; i < str2.length; i++) {
			boolean j = sb.add(str2[i]);
			if (!j)
				System.out.println("duplicate:" + str2[i]);
		}

	}

}
