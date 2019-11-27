
public class FinalClassAccess extends FinalClass{
	
	// If you make any class as final, you cannot extend it.
	void run()
	{
		System.out.println("running safely with 100kmph");
	}  
    
	  public static void main(String args[]){  
	  FinalClassAccess honda= new FinalClassAccess();  
	  honda.run();  

	}

}
