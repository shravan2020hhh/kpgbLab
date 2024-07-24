package hyderabad.java;

public class MethodOverriding extends MethodOverloading {

	public int show(int a, int b, int c) {
		return a + b + c;
	}
	
	@Override
	public int show(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		MethodOverriding child = new MethodOverriding();
		System.out.println(child.show(1, 2));
		MethodOverloading par1 = new MethodOverloading();
		System.out.println(par1.show(0, 0));
		System.out.println(child.show(4,5, 5));

	}
}
