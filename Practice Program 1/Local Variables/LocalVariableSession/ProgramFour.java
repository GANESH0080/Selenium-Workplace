package LocalVariableSession;

//Local variable declared inside the method / constructor
//For local variable no any default value
public class ProgramFour {

	void getData() {
		int i = 10000;
		System.out.println("GetData Method I value is : " + " " + i);
	}

	static void getDetails() {
		int i = 30000;
		System.out.println("GetDetails Method I value is : " + " " + i);
		// Calling getData method in this Method
		ProgramFour t = new ProgramFour();
		t.getData();
	}

	public static void main(String[] args) {
		getDetails();

	}

}
