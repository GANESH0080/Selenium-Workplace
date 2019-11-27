package MethodOverLoad;

public class StepTwo extends StepOne {

	public void getData() {
		System.out.println("Child Class");
	}

	public static void main(String[] args) {
		StepOne a = new StepTwo();
		a.getData();
		a.getData(5, 5);

		StepTwo b = new StepTwo();
		b.getData();
		b.getData(10, 12);

		StepOne c = new StepTwo();
		c.getData();
		c.getData(5, 7);

	}

}
