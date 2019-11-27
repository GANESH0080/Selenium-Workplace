package LocalVariableSession;

//Local variable declared inside the method / constructor
//For local variable no any default value
public class ProgramTwo {

	ProgramTwo() {
		int i = 5000;
		System.out.println("Value of Constructor Local variable I is : " +" " +i);
	}

	static void getData() {
		int i = 10000;
		System.out.println("Method I value is : " +" " +i);
	}

	

	public static void main(String[] args) {
	
		ProgramTwo test = new ProgramTwo();
		getData();
				
	}

}
