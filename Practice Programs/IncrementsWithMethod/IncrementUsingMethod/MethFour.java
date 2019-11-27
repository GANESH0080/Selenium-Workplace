package IncrementUsingMethod;

public class MethFour {

	private int i = 25;

	
	public int getI() {
		return i;
	}


	public void setI(int i) {
		this.i = i;
	}


	void Getresult()
		{
			// User not able to access any private variable in static method
			// For access private variable in static method NEED TO CREATE AN OBJECT
		
			i++;
			System.out.println(i);

		}

	}
	

