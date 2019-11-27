package ClassesMethods;

public class ExampleOne {

	int sID;
	String sName;

	void getStudentdata() {

		sID = 111;
		sName = "Ganesh Mahadev Salunkhe.";

	}

	public static void main(String[] args) {

		ExampleOne test = new ExampleOne();
		test.getStudentdata();
		System.out.println("Student ID is :" + " " + test.sID + " " + "and Student Name is :" + " " + test.sName);

	}
}