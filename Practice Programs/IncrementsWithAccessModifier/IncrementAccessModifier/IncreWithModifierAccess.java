package IncrementAccessModifier;

public class IncreWithModifierAccess {

	public static void main(String[] args) {
		IncreWithModifier test = new IncreWithModifier();
		
		test.setX(15);
		test.setY(35);
		
		int abc = test.getX()+5;
		System.out.println(abc); // 20
		test.setY(abc++);
        System.out.println(abc); //21
        test.setX(test.getX()+1);
        System.out.println(test.getX());
		
	}

}
