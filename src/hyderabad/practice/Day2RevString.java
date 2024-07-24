package hyderabad.practice;

public class Day2RevString {

	public static void main(String[] args) {
		String sw = "nikhil";
		String rev = "";

		for (int i = sw.length() - 1; i >= 0; i--) {
			rev = rev + sw.charAt(i);
		}
		System.out.println(rev);

		
		
		
		
		//method-2
		StringBuilder sb = new StringBuilder();
		sb.append(sw);
		StringBuilder rev1 = sb.reverse();
		System.out.println(rev1);

	}

}
