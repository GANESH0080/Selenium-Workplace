package IncrementUsingMethod;

public class MethodTwo {

	public void Getresult(){
		int x = 27;
		System.out.println(x++);
		System.out.println(x);
		
	}
	
	
	public static void main(String[] args) {
		

		MethodTwo testing = new MethodTwo();
		testing.Getresult();
		
	}

}
