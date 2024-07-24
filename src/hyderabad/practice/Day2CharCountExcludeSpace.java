package hyderabad.practice;

public class Day2CharCountExcludeSpace {

	public static void main(String[] args) {
		//length() is a method used to determine the length of string. 
		String str = "am ready do anything you want";
		str = str.replace(" ", "");
		System.out.println(str);
		int count=0;
		for (int i = 0; i < str.length(); i++) {
			count++;
		}
		System.out.println("total char : "+count);

		
		
		
		


	}

}
