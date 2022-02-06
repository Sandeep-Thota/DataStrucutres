package Recursion;

public class DigitProduct {

	public static void main(String[] args) {
		System.out.println(digitProduct(12));

	}

	static int digitProduct(int n) {
		if(n/10 == 0) {
			System.out.println("current n/10 " +n/10);
			return n;
		}
//		System.out.println("first n%10 " +n%10);
		System.out.println("first n/10 " +n/10);
		return (n%10) * digitProduct(n/10);
	}
}
