package PolymorphismExamples;
// Poly Means Many
// Morphism means Behavior
//polymorphism does not work with static methods, only to instance methods. And also that overriding doesn't work for static methods.

public class Employee_Ganesh extends Employee {

	static String getEmployeeData() {
		return "Ganesh";
	}

}
