package InstanceVariableWithMethod;

public class ExampleOne {
 static int x;

void getData()
{
	x=50;
	System.out.println(x);
}

public static void main(String args[])
{
    System.out.println(+x);
	
	ExampleOne a = new ExampleOne();
	a.getData();
}

}