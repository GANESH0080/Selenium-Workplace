package EnumPractice;
//Java ENUM is different than C & C#

//If you want to create your own range than time you create an ENUM
//Before 1.5 when we want to create an range that time we are using INTERFACE 

//We can define ENUM inside the class as well
//defining ENUM inside the method is not possible
public class EnumExampleTwo {

	enum fruits {
		// Not need to write semicolumn. It is an optional
		APPLE, BANANA, GRAPES, ORANGE, CHIKU
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The Fruit name is" + " " + fruits.APPLE);
		System.out.println("The Fruit name is" + " " + fruits.CHIKU);
	}

}
