package AmstrongNum;

import java.util.Scanner;

public class Armstrong {
	
public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in); //371
	System.out.println("enter a number - ");
	int number = s.nextInt();
	int sum=0, rem;
	System.out.println(number);
	for (int i = number; i > 0; i = i / 10)
	{
		 rem = i % 10;
		    sum = sum + rem * rem *rem;
		    
		System.out.println("number:- "+number);
		System.out.println(" i / 10:- "+ (i / 10));
		System.out.println("i:- "+i);
		System.out.println("rem:- "+ rem);
		System.out.println("sum:- "+sum);
	   
	}
	if(sum==number)
	{
	     System.out.println(number + " is an Armstrong Number\n");
	}
	s.close();
}
}