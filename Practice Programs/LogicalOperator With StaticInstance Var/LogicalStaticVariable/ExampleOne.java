package LogicalStaticVariable;


public class ExampleOne {

	// Instance variable which is declared in class and outside the method with static keyword (Access modifier)
			static  int i;
			static int j;
			static int k;
			static int l;

			public static void main(String[] args) {
				// We are not able to access instance variable in main method when
				// variable not static
				// When we declared variable as static then we can access instance var
				// in main method
				// if (i<j && j<k)

				ExampleOne.i = 10;
				ExampleOne.j = 20;
				ExampleOne.k = 30;
				ExampleOne.l = 40;
				
				if (ExampleOne.i < ExampleOne.j && ExampleOne.j < ExampleOne.k && ExampleOne.k < ExampleOne.l )
				{
		        System.out.println("Pass");
				}
				else
				{
				System.out.println("Fail");
			}
		}
		}