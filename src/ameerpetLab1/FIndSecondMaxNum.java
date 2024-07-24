package ameerpetLab1;

import java.util.*;

public class FIndSecondMaxNum {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(2, 55, 55, 8, 9, 33);

		Set<Integer> num1 = new HashSet<Integer>(num);
		List<Set<Integer>> num2 = Arrays.asList(num1);
		int result = num2.stream().sorted(Comparator.reverseOrder())// sort into reverse order
				.skip(1).get// skip the first large number=55
				.findFirst()// find first value
				.get();// get the value

		System.out.println(result);
		
		
	}

}
