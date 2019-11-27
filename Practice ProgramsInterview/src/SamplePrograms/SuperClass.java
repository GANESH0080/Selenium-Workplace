package SamplePrograms;

public class SuperClass {
	int data = 50;

	public void supermethod() {
		System.out.println(data);
	}

	public void supermethod1() {
		data = data + 100;
		System.out.println(data);
	}

	public static void main(String[] args) {
		SuperClass obj = new SuperClass();
		obj.supermethod();
		obj.supermethod1();
	}
}
