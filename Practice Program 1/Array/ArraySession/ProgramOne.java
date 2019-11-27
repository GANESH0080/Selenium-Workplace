package ArraySession;

public class ProgramOne {

	// Array Declaration
	static String name[] = { "G", "A", "N", "E", "S", " " };

	// Array Declaration
	int[] xyz = { 60, 524, 548, 69 };

	// Creating memory location
	static int[] abc = new int[5];

	public static void main(String[] args) {
		// Printing an array Length
		System.out.println("String Array length" + " " + name.length + ".");
		ProgramOne test = new ProgramOne();
		// Printing an array Length
		System.out.println("Integer Array Length" + " " + test.xyz.length + ".");

		// Initialization of Array
		abc[0] = 11;
		abc[1] = 21;
		abc[2] = 31;
		abc[3] = 41;
		abc[4] = 51;
		// Printing an array Length
		System.out.println("Length of ABC Array is :" + abc.length);
		
	}

}
