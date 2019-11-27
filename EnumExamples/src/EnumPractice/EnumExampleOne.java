package EnumPractice;
//Java ENUM is different than C & C

//If you want to create your own range than time you create an ENUM
//Before 1.5 when we want to create an range that time we are using INTERFACE 

//We can define ENUM inside the class as well
//defining ENUM inside the method is not possible
public class EnumExampleOne {

	public enum Fruits {
		// Not need to write semicolumn. It is an optional
		APPLE, BANANA, CHIKU
	}

	public static void printFruitsName(Fruits Fru) {
		if (Fru == Fruits.APPLE)
			System.out.println("TGIF");
		else
			System.out.println("Some other fruit");
	}

	public static void main(String[] args) {

		// Fruits theFruits = Fruits.APPLE;
		printFruitsName(Fruits.APPLE);

	}

}
