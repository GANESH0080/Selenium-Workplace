package PolymorphismExamples;
// Poly Means Many
// Morphism means Behavior
//polymorphism does not work with static methods, only to instance methods. And also that overriding doesn't work for static methods.

public class Student {

	static int getStudentData() {
		return 10;

	}
	
	public static void main(String[] args) {

		Student testing = new Student();
		System.out.println("Student number is :" + " " + testing.getStudentData());

		Student test = new Student_ABC();
		System.out.println("Student ABC number is:" + " " + test.getStudentData());
		Student test1 = new Student_DEF();
		System.out.println("Student ABC number is:" + " " + test1.getStudentData());
		Student test2 = new Student_XYZ();
		System.out.println("Student ABC number is:" + " " + test2.getStudentData());
	}

}


