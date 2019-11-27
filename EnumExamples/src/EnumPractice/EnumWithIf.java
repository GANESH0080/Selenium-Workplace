package EnumPractice;

public class EnumWithIf {

	enum MobileCom {
		SUMSUNG, HTC, NOKIA, RELIANCE
	}

	public static void Mymethod(MobileCom obj) {
		if (obj == MobileCom.HTC) {
			System.out.println("Correct Mobile Brand");
		} else {
			System.out.println("Incorrect Mobile Brandt");
		}
	}

	public static void main(String[] args) {
		Mymethod(MobileCom.HTC);
	}

}
