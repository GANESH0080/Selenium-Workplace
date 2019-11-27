package PolymorphismExamples;

// Poly Means Many
// Morphism means Behavior
// polymorphism does not work with static methods, only to instance methods. And also that overriding doesn't work for static methods.

public class Car {

	public static void m1() {
		System.out.println("a");
	}

	public void m2() {
		System.out.println("b");
	}
}