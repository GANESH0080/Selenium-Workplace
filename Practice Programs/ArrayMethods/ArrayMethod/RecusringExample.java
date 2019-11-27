package ArrayMethod;

public class RecusringExample {

	void Getarray() {

		int[] arr = { 1, 55, 66, 77, 88, 99, 121, 232, 654, 898, 000 };
		
		System.out.println(arr[2]);

	}

	static void Gettotal() {
		
		
		RecusringExample test = new RecusringExample();
		System.out.println("test start");
		
		test.Gettotal();
		System.out.println("test end");
	}

}

