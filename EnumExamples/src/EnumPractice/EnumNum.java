package EnumPractice;

public class EnumNum {

	enum Numbers {
		A(1), B(10), C(60);
		private int val;

		Numbers(int val) {
			this.val = val;
		}

		int GetValue() {
			return val;
		}
	}

	public static void main(String[] args) {
		System.out.println(Numbers.A.GetValue());

	}

}
