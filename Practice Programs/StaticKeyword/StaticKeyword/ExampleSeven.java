package StaticKeyword;

public class ExampleSeven {
	int abc = 0;

	ExampleSeven() {
		System.out.println("value of ABC is :" + abc);
	}

	void GetData() {
		abc++;
	}

	public static void main(String[] args) {

		ExampleSeven a = new ExampleSeven();
		a.GetData();
		ExampleSeven b = new ExampleSeven();
		b.GetData();
		ExampleSeven c = new ExampleSeven();
		c.GetData();
	}

}
