package hyderabad.practice;

public class Day6RemoveDuplicateCharacter {

	// length is an attribute used to determine the length of
	// arrays and collections in java.
	public static void main(String[] args) {

		String str = "maheshbabu";
		char[] duplicate = str.toCharArray();
		StringBuilder sb = new StringBuilder();//1
		for (int i = 0; i < duplicate.length; i++) {
			boolean repeated = false;//2
			for (int j = i + 1; j < duplicate.length; j++) {
				if (duplicate[i] == duplicate[j]) {
					repeated = true;//3
					break;
				}
			}
			if (!repeated) {
				sb.append(duplicate[i]);
			}
		}
		System.out.println("result: " + sb);
	}

}
