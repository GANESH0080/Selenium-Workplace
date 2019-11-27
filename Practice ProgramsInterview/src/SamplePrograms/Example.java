package SamplePrograms;

class Aase
{
	// Object is the main class in java
	public Object display(String obj)
	{
		System.out.println("Aase.display() " + obj);
		return "0";
	}
}

class Derived extends Aase
{
	@Override
	public String display(String obj)
	{
		System.out.println("Derived.display() " + obj);
		return "Derived";
	}
}


public class Example {
	public static void main(String[] args) {
		
		Aase baseRef = new Derived();
		
		// Due to dynamic binding, will call the derived class
		// display() function
		String data = (String)baseRef.display("test");
		
		System.out.println(data);

	}

}