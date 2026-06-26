package coreJava;

public class AssignmentOperator {

	public static void main(String[] args) {
		int a = 25;

		a += 5;
		System.out.println("a += 5: " + a);

		a -= 3;
		System.out.println("a -= 3: " + a);

		a *= 4;
		System.out.println("a *= 4: " + a);

		a /= 7;
		System.out.println("a /= 7: " + a);

		a %= 9;
		System.out.println("a %= 9: " + a);

		a &= 12;
		System.out.println("a &= 12: " + a);

		a |= 10;
		System.out.println("a |= 10: " + a);

		a ^= 16;
		System.out.println("a ^= 16: " + a);

		a >>= 20;
		System.out.println("a >>= 20: " + a);

		a <<= 6;
		System.out.println("a <<=6: " + a);

	}

}
