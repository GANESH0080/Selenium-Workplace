package LogicaOperatorWithLocalVariable;

public class ExampleThree {
	public static void main(String[] args) {
	
		// Local variable
		final int i = 10;
		final int j = 20;
		final int k = 30;
		final int l = 40;
		
		if (i < j && j < k && k < l )
		{
        System.out.println("Pass");
		}
		else
		{
		System.out.println("Fail");
	}
}

}