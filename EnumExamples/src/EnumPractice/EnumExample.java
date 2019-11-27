package EnumPractice;
//Java ENUM is different than C & C#

//If you want to create your own range than time you create an ENUM
//Before 1.5 when we want to create an range that time we are using INTERFACE 

// We can define ENUM inside the class as well
// defining ENUm inside the method is not possible
enum Mobile {
	// Not need to write semicolumn. It is an optional
	APPLE, SAMSUNG, HTC, NOKIA;
}

public class EnumExample {

	public static void main(String[] args) {

		System.out.println(Mobile.APPLE);
		System.out.println(Mobile.SAMSUNG);
		System.out.println(Mobile.HTC);

	}

}
