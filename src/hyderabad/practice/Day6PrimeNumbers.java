package hyderabad.practice;

import java.util.Scanner;

public class Day6PrimeNumbers {

	public static void main(String[] args) {
		//find prime numbers between x,y
		int countt = 0;
		int i, j = 0;
		int n1 = 1;
		int n2 = 10;
		for (i = n1; i <= n2; i++) {
			for (j = 2; j <= n2; j++) {
				if (i % j == 0) {
					break;
				}
			}
			if (i == j && i % 1 == 0) {
				System.out.println(j);
				countt++;
			}
		}
		System.out.println("total "+countt);

		//Method 2
		//int num = 50;
		int num = 595207;
		int count = 0;
		for (int i1 = 1; i1 <= num; i1++) {
			if (num % i1 == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("prime");
		} else {
			System.out.println("notprime");
		}

		// Find given number prime or not
		// int num = 15;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num1 = sc.nextInt();
		int count1 = 0;
		for (int i1 = 1; i1 <= num1; i1++) {
			if (num1 % i1 == 0) {
				count1++;
			}
		}
		if (count1 == 2) {
			System.out.println("Prime number");
		} else {
			System.out.println("not prime number");

		}

	}

}
