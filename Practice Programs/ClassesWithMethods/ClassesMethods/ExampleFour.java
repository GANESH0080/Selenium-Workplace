package ClassesMethods;

public class ExampleFour {
	
	 void getStudentdata() {

		 // Method variable is Local variable so these variable is not accessible outside the method
		 // For assigning these variable create variable as Global variable
		int sID = 111;
		String sName = "Ganesh Mahadev Salunkhe.";

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExampleThree test = new ExampleThree();
		test.getStudentdata();
		System.out.println("Student ID is :" + " " +test.sID + " " + "and Student Name is :" + " " + test.sName);

		
		
	
	}

}

	
	
	
	
	

}
