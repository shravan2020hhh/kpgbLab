package hyderabad.practice;

public class Day2ReverseNum {

	public static void main(String[] args) {
	
		//Mwthod 1
		int num = 1654;
		int rev=0;
		while(num>0) {
			rev = rev*10+num%10;
			num = num/10;
		}
		System.out.println(rev);
	

	//Method 2	
	int nu=45647;
	StringBuilder sb = new StringBuilder();
	sb.append(nu);
	 StringBuilder re = sb.reverse();
	 System.out.println(re);
	 
	 //Method 3
	 StringBuffer sb2 = new StringBuffer("65466");
	// sb2.append("5555");
	 StringBuffer re2=sb2.reverse();
	 System.out.println(re2);
}
}