package LogicaOperatorWithLocalVariable;

public class ElevenTwelve {

	ElevenTwelve() {
		getData();
	}

	static void getData() {
		int a = 10;
		if (!(a == 20)) {
			System.out.println("False");
		} else {
			System.out.println("Pass");
		}
	}

	public static void main(String[] args) {
		ElevenTwelve test = new ElevenTwelve();
	}
}
