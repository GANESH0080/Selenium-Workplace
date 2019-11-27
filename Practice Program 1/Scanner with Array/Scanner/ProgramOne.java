package Scanner;

import java.util.Scanner;

public class ProgramOne {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the array size");
		int m = scan.nextInt();
		System.out.println("Entered Array size is :" + m);
		int array[] = new int [m];
		System.out.println("Array Length is:" +array.length);
		array[0] = 11;
		array [1] = 22;
		
		for (int i = 0; i<array.length;i++)
		{
			array[i] = i;
			System.out.println("Array index is :" +i);
		}
	
		for (int str : array)
		{
			System.out.println("Array Elements are :" +str);
		}
	}

}
