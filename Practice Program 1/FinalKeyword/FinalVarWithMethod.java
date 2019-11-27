
public class FinalVarWithMethod {

	void m1() {
		final String name = "Ganesh";
		System.out.println(name);
		name = "Rohit";
	}

	public static void main(String[] args) {
		FinalVarWithMethod f = new FinalVarWithMethod();
		f.m1();
	}

}
