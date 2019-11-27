package GetUserDeails;

import java.util.Scanner;

public class DataGet {

	public static void enterInput() {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter Roll number");

		System.out.println("Entered Roll nuber is :" + scan.nextInt());

		enterStringInput();

	}

	public static void enterStringInput() {
		Scanner scano = new Scanner(System.in);

		System.out.println("Please enter Name");
		String str = scano.next();
		System.out.println("Entered name is :" + str);
	}
}
