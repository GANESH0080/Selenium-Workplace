package PolymorphismExamples;

public class Bank_MAIN {
	// Poly Means Many
	// Morphism means Behavior
	public static void main(String[] args) {
		Bank test = new Bank_ABC();
		test.getInterestrate();
		System.out.println("IntrestRate of Back ABC is :" + " " + test.getInterestrate());

		Bank test1 = new Bank_DEF();
		System.out.println("IntrestRate of Back DEF is :" + " " + test1.getInterestrate());

		Bank test2 = new Bank_XYZ();
		System.out.println("IntrestRate of Back XYZ is :" + " " + test2.getInterestrate());
	}

}
