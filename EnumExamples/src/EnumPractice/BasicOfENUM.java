package EnumPractice;

// Java ENUM is different than C & C#
// If you want to create your own range than time you create an ENUM
// Before 1.5 when we want to create an range that time we are using INTERFACE 

interface MobileCompanyRange {
	// Capital letter APPLE (Variable) is known as CONSTANT
	// Bydefaut the constant / variable is Final, even If not declared as Final
	// Always declare the Constant as in CAPITAl letter
	static String APPLE = "Apple";
	static String MANGO = "Mango";
	static String BANANA = "Banana";
	static String CHIKU = "Chiku";
}

public class BasicOfENUM {

	public static void main(String[] args) {
		// How can you know that APPLE is string not integer because you may compare your own int / string with APPLE
		// That why instead of working this constant you have to use ENUM
		if(MobileCompanyRange.APPLE) = "Apple";
	}

}
