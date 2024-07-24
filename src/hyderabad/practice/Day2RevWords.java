package hyderabad.practice;

public class Day2RevWords {

	public static void main(String[] args) {
		
		//Method-1
		String str = "I am thinking about u" ;
		String []a =str.split(" ");
		int count=0;
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		
		//Method-2
		String step2="";
		for(int i=a.length-1;i>=0;i--) {
			 step2 = step2+a[i]+" ";
		}
		System.out.print(step2);
		System.out.println();
		
	}

}
