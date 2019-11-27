package IncrementAccessModifier;

public class IncrementAccess {

	public static void main(String[] args) {
		Increment test = new Increment();
		test.setX(32);
		test.setX(test.getX() + 1);

		System.out.println(test.getX()); // 33

		int i = test.getX() + 1;

		System.out.println(i); // 34
		System.out.println(i++); // 34
		System.out.println(i++); // 35
		i++;
		System.out.println(i); // 37
		--i;
		System.out.println(i); // 36

		System.out.println(--i); // 35

		i++;
		System.out.println(--i); // 35

		System.out.println(i); // 35

		System.out.println(i++); // 35

		System.out.println(--i); // 35

		System.out.println(--i); // 34

		System.out.println(i++); // 34

		System.out.println(i++); // 35

		System.out.println(i++); // 36

	}

}
