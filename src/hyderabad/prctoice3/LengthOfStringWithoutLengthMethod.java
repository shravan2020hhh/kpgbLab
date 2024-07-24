package hyderabad.prctoice3;

public class LengthOfStringWithoutLengthMethod {

	public static void main(String[] args) {
//		//method 1
		String s = "sravnkumar";
//		int i=0;
//		for(char c:s.toCharArray()) {
//			 i++;
//		}
//		System.out.println(i);

		System.out.println(countChar(s));
	}

	// method 2
	public static int countChar(String s1) {
		int i=0;
	try {
		for( i=0;;i++) {
			s1.charAt(i);
		}
		}
	catch(Exception e) {
			
		}
	return i; 
		

}}
