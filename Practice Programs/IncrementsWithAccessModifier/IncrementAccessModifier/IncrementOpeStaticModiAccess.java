package IncrementAccessModifier;

public class IncrementOpeStaticModiAccess {

	public static void main(String[] args) {

		IncrementOpeStaticModi.x = 25;

		IncrementOpeStaticModi.x += 5;
		System.out.println(IncrementOpeStaticModi.x++); // 30
		System.out.println(++IncrementOpeStaticModi.x); // 32
		IncrementOpeStaticModi.x += 5;
		System.out.println(IncrementOpeStaticModi.x++); // 37
		System.out.println(--IncrementOpeStaticModi.x); // 37

	}

}