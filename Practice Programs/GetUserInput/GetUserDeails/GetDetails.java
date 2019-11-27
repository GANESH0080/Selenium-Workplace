package GetUserDeails;

import java.util.Scanner;

public class GetDetails {


	static Scanner scan = new Scanner(System.in);

		public static void enterInput() {
			
		
			
			System.out.println("Please enter Roll number");

			System.out.println("Entered Roll nuber is :" + scan.nextInt());
			
			
			enterStringInput();
		}
	
		public static void enterStringInput() {

			System.out.println("Please enter Name");
			String str = scan.next();
			System.out.println("Entered name is :" + str);
		}
}
