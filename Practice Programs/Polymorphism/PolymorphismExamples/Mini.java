package PolymorphismExamples;

// Poly Means Many
// Morphism means Behavior
// polymorphism does not work with static methods, only to instance methods. And also that overriding doesn't work for static methods.
class Mini extends Car {
	public static void m1() {
		System.out.println("c");
	}

	public void m2() {
		System.out.println("d");
	}
}
