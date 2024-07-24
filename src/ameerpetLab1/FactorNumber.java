package ameerpetLab1;

import java.util.Scanner;

public class FactorNumber {

	public static void main(String[] args) {
		int n = 0;
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Any Value");
			n = sc.nextInt();
		} catch (Exception e) {

			System.out.println("Enter Valid Number");
		}
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				System.out.println(i);
		}
	}
}
