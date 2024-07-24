package hyderabad.practice;

public class Day8Intervie2Preactice {

	public static void main(String[] args) {
		//print 1 to 10
		int i1=1;
		for(i1=1;i1<=20;i1++){
			System.out.println("practice: "+i1);
		}
		
		//max number finding
		int a1 = 23, b1 = 54, c1 = 2;

		if (a1 > b1 && a1 > c1) {
			System.out.println(a1);
		} else if (b1 > c1) {
			System.out.println(b1);
		} else {
			System.out.println(c1);
		}
		
		//find table of given number
		int num1 = 4;
		for (int i = 1; i <= 10; i++) {
			System.out.println(num1 * i);
		}
		
		// factorial of given number
		int num11 = 4;
		int fact1 = 1;

		for (int i = 1; i <= num11; i++) {
			fact1 = fact1 * i;
		}
		System.out.println(fact1);

		// find perfect number
		int num111 = 28;
		int sum1 = 0;

		for (int i = 1; i < num111; i++) {
			if (num111 % i == 0) {
				sum1 = sum1 + i;
			}
		}
		System.out.println(sum1);
		if (sum1 == num111) {
			System.out.println("perfect number");
		} else {
			System.out.println("Not perfect number");
		}

		// divisible by 3 or 5 from 1 to 40
		for (int i = 1; i <= 40; i++) {
			if (i % 5 == 0 || i % 3 == 0) {
				System.out.println(i);
			}
		}

		// find even number from 1 to 20

		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.println("even " + i);
			}
		}
		for (int i = 2; i <= 16; i = i + 2) {
			System.out.println(i);
		}
	}

}
