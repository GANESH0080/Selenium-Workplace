package SingleInheritanceExam;

public class ExampleOneMain {

	public static void main(String[] args) {

		ExampleOneChild test = new ExampleOneChild();
		test.data();
		test.getData();

		// We are not able to access child class using parent class
		// ExampleOneChild testing = new ExampleOneParent();

		ExampleOneParent testingX = new ExampleOneParent();
		testingX.getData();

		ExampleOneParent testingY = new ExampleOneChild();
		testingY.getData();

	}

}
