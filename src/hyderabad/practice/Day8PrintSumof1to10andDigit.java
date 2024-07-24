package hyderabad.practice;

public class Day8PrintSumof1to10andDigit {

	public static void main(String[] args) {
		
		int result = 0;
		for (int i = 1; i <= 10; i++) {
			result = result + i;

		}
		System.out.println(result);
		
		//print sum of given number
		int num = 23432;
		int sum = 0;
		while (num > 0) {
			sum = sum + num % 10;
			num = num / 10;
		}
		System.out.println(sum);
	}

}
