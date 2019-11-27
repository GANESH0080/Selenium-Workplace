package StaticKeywords;

public class Employee {

	int empnum;
	String empname;
	static int empmarks;

	public static void getEmployeeDetails() {

		Employee.empmarks = 77;
		Employee emp = new Employee();
		emp.empname = "Ganesh";
		emp.empnum = 200;

		System.out.println("The name of Employee is: " + emp.empname + " " + "and Employee number is :" + emp.empnum
				+ " " + "Employee marks is :" + emp.empmarks);
	}

	public static void main(String args[]) {

		Employee.getEmployeeDetails();

	}
}
