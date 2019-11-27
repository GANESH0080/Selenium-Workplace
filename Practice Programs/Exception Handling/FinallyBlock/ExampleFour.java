package FinallyBlock;

public class ExampleFour {
static int b;
	public static void main(String[] args) {
		try{
			b = 100/2;
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		
			System.out.println("Value of B:" +b);
		}
		finally
		{
			System.out.println("Finally");
		}
			
	}

}
