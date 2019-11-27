package PolymorphismExamples;
// Poly Means Many
// Morphism means Behavior
//polymorphism does not work with static methods, only to instance methods. And also that overriding doesn't work for static methods.

public class Employee {

	static String getEmployeeData() {
		return "Shree";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee_Jyotiram();
		emp.getEmployeeData();
		System.out.println(emp.getEmployeeData());
	}

}
