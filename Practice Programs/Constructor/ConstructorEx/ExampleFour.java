package ConstructorEx;

public class ExampleFour {
	static int length;
	static int breath;
	static int height;

	ExampleFour() {
		length = 10;
		breath = 5;
		height = 25;
System.out.println("Length is:" +" "+length);
System.out.println("Length * Breath: " +" " +length*breath);
System.out.println("Length * Breath * Height: " +" " +length*breath*height);
	}

 static int getCubeVolume() {

		return (length * breath * height);
	}

}