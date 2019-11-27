package StaticKeywords;

public class Student {

	String name;
	int rollNo;
	static int noOfStudents = 0;

	/*
	 * public String getName() { return name; }
	 * 
	 * public void setName(String name) { this.name = name; }
	 * 
	 * public int getRollNo() { return rollNo; }
	 * 
	 * public void setRollNo(int rollNo) { this.rollNo = rollNo; }
	 */

	Student() {
		noOfStudents++;

	}

	public static int getNoOfStudent() {

		return noOfStudents;

	}
}