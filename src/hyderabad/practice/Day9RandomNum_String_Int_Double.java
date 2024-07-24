package hyderabad.practice;

import java.util.Random;
//Library error
//import org.apache.commons.lang3.RandomStringUtils;


public class Day9RandomNum_String_Int_Double {
	
	public static void main(String[] args) {
		Random r = new Random();
		
		double ranDouble = r.nextDouble();
		System.out.println("x "+ranDouble);
		int ranInt = r.nextInt();
		System.out.println("y "+ranInt);
		//Math.random()-->generate min number is 0 and max number is 0.9999
		//(int) type will convert into int
		//*10 will give  output not decimal
		System.out.println("yyy "+Math.random());
		System.out.println("zzz "+Math.random()*10);
		System.out.println("xxx "+(int)(Math.random()*10));
		
		/*Below method depends on import.org.apache.commons.lang3.RandomStringUtils;*/
//		String numeric =  RandomStringUtils.randomNumeric(7);
//		System.out.println(numeric);
//
//		String alphabet = RandomStringUtils.randomAlphabetic(5);
//		System.out.println(alphabet);
		
	}

}
