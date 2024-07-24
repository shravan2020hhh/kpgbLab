package hyderabad.practice;

public class Day5NumberPattern {

	public static void main(String[] args) {
//		12345
//		12345
//		12345
//		12345
//		12345
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
//		....1
//		...123
//		..12345
//		.1234567
//		123456789
		for(int i=1;i<=5;i++) {
			for(int k=1;k<=5-i;k++) {
				System.out.print(".");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
//			1
//		   22
//		  333
//		 4444
//		55555
		for(int i=1;i<=5;i++) {
			for(int k=1;k<=5-i;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-j;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
