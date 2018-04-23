package br.com.chrbarreto.basics;

public class DeclaringVariables {

	static String staticVariable;

	/*
	 * Default values: 
	 * Objects: null 
	 * double/float: 0.0 
	 * int/short/byte: 0 
	 * long: 0
	 * char: '' 
	 * boolean: false
	 */

	double defaultDoubleValue;
	int defaultIntegerValue;
	long defaultLongValue;
	char defaultCharValue;
	boolean defaultBooleanValue;

	public static void main(String[] args) {

		// valid variables names can start with letters, $ or _
		// and after the first character, they may have digits too
		int _value, $value, value, value1;
		int __; // weird, but it is a valid name in java

		String nonInstantiatedVariable;

		// System.out.println(nonInstantiatedVariable); // compilation error.
		// You cannnot use a local variable before initialize it with some value
		// or null.
		System.out.println(staticVariable); // static variables, however, have a
											// default value. This prints null.

		// instance variables also have a default value
		DeclaringVariables show = new DeclaringVariables();
		System.out.println(show.defaultBooleanValue); // false
		System.out.println(show.defaultDoubleValue); // 0.0
		System.out.println(show.defaultLongValue); // 0
		System.out.println(show.defaultCharValue); // <empty output>
		System.out.println(show.defaultIntegerValue); // 0

	}
}
