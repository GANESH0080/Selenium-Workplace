package PolymorphismExamples;
// Poly Means Many
// Morphism means Behavior
// polymorphism does not work with static methods, only to instance methods. And also that overriding doesn't work for static methods.
public class CarMini_MAIN {

	public static void main(String args[]) {
		Car c = new Mini();
		c.m1();
		c.m2();
	}
}