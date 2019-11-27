package SuperKey;

public class AccessMethodChild extends AccessMethod {

	void parentMethod() {
		String name = "Ninad";
		System.out.println(name);

	}
	void abcmethod()
	{
		System.out.println("Ganesh Mahadev Salunkhe");
	}
	
	void mainmethod(){
		super.parentMethod();
		abcmethod();
	}

	public static void main(String[] args) {
		AccessMethodChild obj = new AccessMethodChild();
		obj.mainmethod();
	}

}
