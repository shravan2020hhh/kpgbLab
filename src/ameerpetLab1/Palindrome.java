package ameerpetLab1;

public class Palindrome {
	public static void main(String[] args) {
		
	
	int num = 220;
	int temp = num;
	int res = 0;
	while(num>0)
	{
		res = res * 10 + num % 10;
		num = num / 10;
	}
	System.out.println(res);
	if(res==temp)
		System.out.println("yes");
	else 
		System.out.println("No");
}
}