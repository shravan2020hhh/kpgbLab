package hyderabad.practice;

import java.util.Scanner;

public class Day5OddEven_PositNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value: ");
		int num = sc.nextInt();
		if (num%2==0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
		
		if(num>0) {
			System.out.println("positive");
		}else if(num<0) {
			System.out.println("negative");
		}else {
			System.out.println("zero");
		}
	}

}
