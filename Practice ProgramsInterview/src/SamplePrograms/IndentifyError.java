package SamplePrograms;

public class IndentifyError {

	public static void main(String[] args) {
		try {
			int a[] = new int[5];
			a[6] = 30;
		}
		// Exception e should be placed at the last because Exception e catch
		// all type of exception
		// then other below exceptions or code not get executed
		// Try will always search match exception currently it is matched with
		// Arithmatic exception
		// If in try we enter a[6] = 30 then it will check for Array out of
		// Bound exception
		
		
		catch (Exception e) {
			System.out.println("Common task completed");
			System.out.println(e);
		}

		catch (ArithmeticException e) {
			System.out.println("Task 1 is completed");

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Task 2 completed");
		}

		System.out.println("Rest of the Code");
	}

}

// getting Compile time error
