package hyderabad.practice;

import java.util.Random;
import java.util.function.Supplier;

public class Day9RandomOTP {
	// Math.random()-->generate min number is 0 and max number is 0.9999
	// (int) type will give output not decimal
	public static void main(String[] args) {

//		Supplier<String> otps = () -> {
//			String otp = "";
//			for (int i = 1; i <= 6; i++) {
//				otp = otp + (int) (Math.random() * 10);
//			
//			}
//			return otp;
//		};
//
//		System.out.println(otps.get());
//		System.out.println(generateOtp());


		String otp = "";
		for(int i=0;i<6;i++) {
			otp=otp+(int)(Math.random()*10);
			
		}System.out.println(otp);
		
		Random random = new Random();
		
		

}}
