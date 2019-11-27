package ArrayForLoop;

import java.util.Scanner;

public class ExampleSeven {

	public static void main(String[] args) {
		// User input
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Values :");

		int[] array = new int[5]; // Intilized array of size 5

		for (int i = 0; i < 5; i++) // used for loop for user input

		{

			array[i] = scan.nextInt(); // Assigned users value to array

		}
		for (int i = 0; i < 5; i++) // for loop to display values

		{

			System.out.println("Values are :" + array[i]);

		}
	}
}
