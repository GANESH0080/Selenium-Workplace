package Inheritance;

public class BaseClass extends ParentClass {
	BaseClass() {
		System.out.println("Child Class Constructor");
	}

	void getData() {

		System.out.println("Child class Method");
	}

	public static void main(String[] args) {

		ParentClass a = new ParentClass();
		BaseClass b = new BaseClass();
		ParentClass c = new BaseClass();
		c.getData();

	}

}
