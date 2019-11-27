// Instance Variable is known as Object level variable.
// Instance variables are declared in a class, but outside a method, constructor or any block.
package InstanceVariable;

public class ExampleThree {
	public int x;
	public String abc;

	public static void main(String[] args) {
		// Instance variable not able to access in any static or main method when variable declared without STATIC
		System.out.println(+x);
		System.out.println(abc);

	}

}
