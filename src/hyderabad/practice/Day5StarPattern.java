package hyderabad.practice;

public class Day5StarPattern {

	public static void main(String[] args) {
//			*
//		   ***
//		  *****
//		 *******
//		*********
		for (int i = 1; i <= 5; i++) {
			for (int s = 1; s <= 5 - i; s++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

//		#########
//		 #######
//		  #####
//		   ###
//		    #
		for (int i = 1; i <= 5; i++) {
			for (int k = 1; k <= i - 1; k++) {
				System.out.print(" ");
			}
			for (int j = 9; j >= i * 2 - 1; j--) {
				System.out.print("#");
			}

			System.out.println();
		}

//		*****/////
//		*****/////
//		*****/////
//		*****/////
//		*****/////

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			for (int k = 1; k <= 5; k++) {
				System.out.print("/");
			}
			System.out.println();
		}

//			*]]]]
//			***]]]
//			*****]]
//			*******]
//			*********

		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			for (int k = 1; k <= 5 - i; k++) {
				System.out.print("]");
			}
			System.out.println();
		}

//			1
//	      111
//	    11111
//	  1111111
//	111111111
		
		for (int i = 1; i <= 5; i++) {
			for (int k = 7; k >= 2 * i - 2; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("1");
			}
			System.out.println();
		}

//		sssssssss
//		sssssss
//		sssss
//		sss
//		s
		for (int i = 1; i <= 5; i++) {
			for (int j = 9; j >= 2 * i - 1; j--) {
				System.out.print("s");
			}
			System.out.println();
		}

	}

}
