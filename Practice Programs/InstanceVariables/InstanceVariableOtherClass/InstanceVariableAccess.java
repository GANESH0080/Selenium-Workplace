package InstanceVariableOtherClass;

public class InstanceVariableAccess {

	public static void main(String[] args) {
		// Instance variable default value in 0 for Integer.
		// Instance variable default value in NULL for String.
		// Instance Variable declaration
	    // We can access any Instance variable in other class of same package using Class name	
System.out.println(InstanceVariable.x);
System.out.println(InstanceVariable.abc);


InstanceVariable a = new InstanceVariable();
// Static Instance variable can access in static or main method using object also but access using classname is best
System.out.println("Using Object default value of instance Integer Variable:" +a.x);


System.out.println("Using Object default value of instance String Variable::" +InstanceVariable.abc);


	}

}
