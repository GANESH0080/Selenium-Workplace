package TryCatch;

public class MultipleCatch {

	public static void main(String[] args) {
		 int a[]=new int[7];
		 try { 
		
         a[4]=30/0;
         System.out.println("First print statement in try block");
	}
		 catch(ArithmeticException e){
		        System.out.println("Warning: ArithmeticException");
		     }
		     catch(ArrayIndexOutOfBoundsException e){
		        System.out.println("Warning: ArrayIndexOutOfBoundsException");
		     }
		     catch(Exception e){
		        System.out.println("Warning: Some Other exception");
		     }
		   System.out.println("Out of try-catch block...");
		  }
		}


/*In the above example there are multiple catch blocks and these catch blocks executes sequentially when an exception occurs in try block.
Which means if you put the last catch block ( catch(Exception e)) at the first place, 
just after try block then in case of any exception this block will execute as it can handle all exceptions. 
This catch block should be placed at the last to avoid such situations.*/
