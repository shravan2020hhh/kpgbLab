package ameerpetLab1;

public class PrimeNumber_100 {

	public static void main(String[] args) {
		int n = 50;
		int count = 0;
//		for (int i = 20; i <= n; i++) {
			if (PrimeNumber_100.check_Prime(n)) {
				System.out.println(n + " :prime");
				count++;
			} else
				System.out.println(n + " :Not prime");

//		}
		System.out.println("total Prime: " + count);
	}

	static boolean checkPrime(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				count++;
		}
		if (count == 2)
			return true;
		else
			return false;
	}

	static boolean check_Prime(int n) {
		if (n == 2)
			return true;
		if (n < 2 || n % 2 == 0)
			return false;

		for (int i = 3; i <= n / 2; i = i + 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}

//		for( i=1;i<=n;i++) {
//			if(n%i==0)
//				count++;
//		}
//		if (count == 2)
//			System.out.println("Prime");
//		else
//			System.out.println("Not");
