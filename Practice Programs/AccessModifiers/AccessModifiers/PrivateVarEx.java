package AccessModifiers;

public class PrivateVarEx 
{
	// Define name variable with private static
	private static String name;

	// Created get & set method for accessing private variable in other class
	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		PrivateVarEx.name = name;
	}
}
