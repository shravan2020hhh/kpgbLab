package hyderabad.java;

public class MethodOverloading {

	public int show(int a, int b) {
		a=8;
		b=7;
		return a + b;
	}

	public int show(int a, int b, int c) {
		return a + b + c;
	}

	public double show(double a, double b) {
		return a - b;
	}

	public static void main(String[] args) {
		MethodOverloading par1 = new MethodOverloading();
		System.out.println(par1.show(0, 0));
		System.out.println(par1.show(6, 6, 4));
		System.out.println(par1.show(9.9, 8.7));

	}

}
