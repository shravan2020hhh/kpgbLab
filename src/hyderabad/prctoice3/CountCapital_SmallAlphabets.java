package hyderabad.prctoice3;

public class CountCapital_SmallAlphabets {

	public static void main(String[] args) {
		
		String s = "Welcome To Automation 354";
//		int upper = 0;
//		int lower = 0;
//
//		for (int i = 0; i < s.length(); i++) {
//			if (i > 'A' & i < 'Z') {
//				upper++;
//
//			}
//
//			else if (i > 'a' & i < 'z') {
//				lower++;
//
//			}
//
//		}
//		System.out.println("upper " + upper);
//		System.out.println("lower " + lower);

		////////////////
		int UC = 0;
		int LC = 0;
		int num = 0;
		int space = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 65 && ch <= 90) {
				UC++;
			} else if(ch >=97 && ch <=123) 
				LC++;
			
			else if(ch >=48 && ch <=57)
				num++;
			else {
				space++;
			}
			}
		
		System.out.println("UCase " + UC);
		System.out.println("LCase " + LC);
		System.out.println("numerical " + num);
		System.out.println("space " + space);

		
		//Print capital letters and small letters 
		String Ucase = "";
		String Lcase = "";
		for (int i = 0; i < s.length(); i++) {
			char res = s.charAt(i);
			if (res >= 65 && res <= 90) {
				Ucase = Ucase + res;
			} else {
				Lcase = Lcase + res;
			}
		}
		System.out.println(Ucase);
		System.out.println(Lcase);
	}
}
