package IncrementAccessModifier;

public class IncreOperPrivateAccess {

	public static void main(String[] args) {
		IncreOperPrivate test = new IncreOperPrivate();
		
	test.setX(38);
	
	System.out.println(test.getX());
	
	double i = test.getX()+5;
	System.out.println(i);
	
	
	
	}

}
