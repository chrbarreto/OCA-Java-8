package br.com.chrbarreto.basics;

public class Numerals {

	// public static void main(String[] args) is the most commom, but
	// the string array can have any name.
	public static void main(String[] anything) {
		// it is possible to use numerals in different bases
		int octal = 017; // 15 in decimal
		int binary = 0b101; // 5 in decimal
		int alsoBinary = 0B101; // 5 in decimal
		int hex = 0x1f; // 31 in decimal
		int alsoHex = 0X1F; // 31 in decimal
		int dec = 2;

		double result = Math.pow(binary, dec);
		System.out.println(result); // prints 25.0

		result = octal + hex;
		System.out.println(result); // prints 46.0

		result = alsoHex - alsoBinary;
		System.out.println(result); // prints 26.0

		int bigIntegerNumber = 1_000_000_000; // undescore is allowed if between
												// numbers
		// double BigDoubleNumber = 1_000_000_.00 invalid for the reason listed
		// above.
		double BigDoubleNumber = 1_000_000.00; // valid

		System.out.println(bigIntegerNumber / 1000); // prints 1000000
		System.out.println(BigDoubleNumber / 1000); // prints 1000.00
	}
}
