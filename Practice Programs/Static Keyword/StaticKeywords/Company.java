package StaticKeywords;

public class Company {
	int num;
	String name;
	static int marks;

	public static void getEmployeeDetails() {

		Company.marks = 88;
		Company emp = new Company();
		emp.name = "Ganesh";
		emp.num = 200;

		System.out.println("The name of company Employee is: " + emp.name + " " + "and Employee number is :" + emp.num
				+ " " + "Employee marks is :" + emp.marks);
	}
}
