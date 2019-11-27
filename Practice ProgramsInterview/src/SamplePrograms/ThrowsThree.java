package SamplePrograms;

public class ThrowsThree {

	public static void main(String[] args) {
		try{
			Thread.sleep(10000);
			throw new InterruptedException();
		}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println("Hello Geeks");
	}
}
