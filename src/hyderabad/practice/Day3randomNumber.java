package hyderabad.practice;

import java.util.Random;

public class Day3randomNumber {

	public static void main(String[] args) {
		int min = 100000;
		int max = 999999;
		Random randm = new Random();
		
		int randomNumber = randm.nextInt(max - min + 1) + min;
		System.out.println("result "+randomNumber);
		
		}

}
