package EnumPractice;

public class EnumNumber {

	enum Number {
		AUDIO(0), VIDEO(1), AUDIO_AND_VIDEO(3);
		private int val;

		Number(int val) {
			this.val = val;
		}

		public int getVal() {
			return val;
		}
	}

	public static void main(String args[]) {
		System.out.println(Number.AUDIO_AND_VIDEO.getVal());

	}
}
