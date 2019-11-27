package SamplePrograms;

public class SingleTonDesignPattern {

	// Created instance "soleinstance" for SingleTonDesignPattern class
	private static SingleTonDesignPattern soleinstance = new SingleTonDesignPattern();

	// Created an private constructor because no one can create an another class instance using new Keyword
	private SingleTonDesignPattern() {

	}

	// Created an method for global access point
	public static SingleTonDesignPattern getinstance() {
		return soleinstance;

	}
}

class TestClass {
	public static void main(String [] args) {
		// Not allow or not able to create an new instance because you have created an constructor as Private"
		SingleTonDesignPattern s1 = SingleTonDesignPattern.getinstance();
		SingleTonDesignPattern s2 = SingleTonDesignPattern.getinstance();
		print("s1", s1);
		print("s2", s2);
	}
	static void print(String name, SingleTonDesignPattern object)
	{
		System.out.println(String.format("Object : %s,  Hashcode: %d" , name , object.hashCode()));
	
}
}