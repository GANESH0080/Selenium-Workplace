package LoadingRiding;

class ExTwo extends ExOne{
	
	static void getData() {
		System.out.println("Child Class");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExOne a = new ExOne();
		a.getData();
		ExOne.getData();
		
		
		ExTwo b = new ExTwo();
		b.getData();
		ExTwo.getData();
		getData();
		
		
		ExOne c = new ExTwo();
		c.getData();
		// We are not able to inherite derive class methods using Base class
		//ExTwo d = new ExOne(); -- Getting error
		
		
		
	}

}
