package ConstructorEx;

//Constructor name is same name as CLASSNAME.
//Constructor never return any value
public class ExampleThree {
	int breath;
	int length;
	int height;

	public int getCubeVolume() {
		return (length * breath * height);
	}

	ExampleThree() {
		System.out.println("We are in Constructor");
		length = 10;
		breath = 20;
		height = 30;

	}

}