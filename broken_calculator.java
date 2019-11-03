package hackerblocks;

import java.math.BigInteger;
import java.util.Scanner;

public class broken_calculator {
	public static BigInteger fact(int n) {
		BigInteger mul = new BigInteger("1");
		for (int i = 2; i <= n; i++) {
			mul = mul.multiply(BigInteger.valueOf(i));
		}
		return mul;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		System.out.println(fact(a));
	}
}
