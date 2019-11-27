package ArraySession;

import java.util.Arrays;

public class ProgramThreeAccess {

	
	static void getData()
	{
		String stringarray [] = {"C","O","G","I","T","A","T","E"};
		System.out.println("Printing Arrays : " + Arrays.toString(stringarray));
	
	
	
	for(String str : stringarray)
	 {
           System.out.println("Array OneByOne" +" "+str);
       }
	}
	public static void main(String[] args) {
		ProgramThree test = new ProgramThree();
		
		getData();
		
		
		
	}

}
