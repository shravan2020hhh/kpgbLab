package ameerpetLab1;

public class CheckPrimeModified {

	public static void main(String[] args) {
		// check between numbers prime or not
		for (int i = 50; i <= 10000; i++) {
			if (CheckPrimeModified.checkPrimeNumber(i))
				System.out.println(i + " prime");
//			else
//				System.out.println(i + " Not prime");

		}
		// check single digit prime or not
//		int n = 5;
//		if (CheckPrimeModified.checkPrimeNumber(n))
//			System.out.println(n + " :Prime");
//		else
//			System.out.println(n + " :NotPrime");
	}

	static boolean checkPrimeNumber(int n) {
		if (n == 2)
			return true;
		if (n < 2 || n % 2 == 0)
			return false;
		//for (int i = 3; i <= n/2; i = i + 2) {
		for(int i=3;i<=(int)Math.sqrt(n);i=i+2) {
		if (n % i == 0)
				return false;
		}
		return true;
	}
}
