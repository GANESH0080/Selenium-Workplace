package SingleInheritanceExam;

// Single Inheritance has only 2 classes (One to One relation)
public class ExampleOneParent {

	int a = 10;

	void getData() {
		System.out.println("Value of parent class is:" +" "+a);
	}

}

class ExampleOneChild extends ExampleOneParent {

	int xyz = 22;

	void data() {
		System.out.println("Value of base class is:" +" "+xyz);
	}
}