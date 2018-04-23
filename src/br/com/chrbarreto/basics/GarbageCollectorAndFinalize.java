package br.com.chrbarreto.basics;

public class GarbageCollectorAndFinalize {

	@Override
	/*
	 * This method may or not be called before running the java collector It is
	 * guaranteed, however, that it only executes once
	 */
	protected void finalize() throws Throwable {
		System.out.println("called finalize");
	}

	public static void main(String... args) {
		GarbageCollectorAndFinalize gc = new GarbageCollectorAndFinalize();
		gc = null;
		System.gc(); // suggests to the jvm to run the garbage collector.
	}
}
