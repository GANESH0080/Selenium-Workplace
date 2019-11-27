package StaticKeyword;

public class ExampleSix {

	static int abc = 0;

	ExampleSix() {
		System.out.println("value of ABC is :" + abc);
	}

	void GetData() {
		abc++;
	}

	public static void main(String[] args) {

		ExampleSix a = new ExampleSix();
		a.GetData();
		ExampleSix b = new ExampleSix();
		b.GetData();
		ExampleSix c = new ExampleSix();
		c.GetData();
	}

}
