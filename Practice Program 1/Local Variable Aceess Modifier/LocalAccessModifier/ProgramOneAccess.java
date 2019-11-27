package LocalAccessModifier;

public class ProgramOneAccess {

	public static void main(String[] args) {
		ProgramOne test = new ProgramOne();
		
		// Static method directly access in static method if it is available in same class 
		// Static method can access in static method using class name.
		ProgramOne.getData();
		// Or you can access using object but that is not a correct approch
		// test.getData();

	}

}
