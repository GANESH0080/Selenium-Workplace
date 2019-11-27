package GetUserDeails;

import java.util.Scanner;

public class GetUseEntry {

	

	public void enterInput() {
		System.out.println("Please enter Roll number");

		Scanner scan = new Scanner(System.in);
		System.out.println("Entered Roll nuber is :" + scan.nextInt());

		System.out.println("Please enter Name");
		String str = scan.next();
		System.out.println("Entered name is :" +str);
	}

}
