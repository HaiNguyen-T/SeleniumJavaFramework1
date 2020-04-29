package Demo;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		try {
			demo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("I am inside catch bloc");
			System.out.println("Message is "+ e.getMessage());
			System.out.println("Cause is " + e.getMessage());
			System.out.println("This is Main function");
		}

	}
	public static void demo() throws Exception {
		// TODO Auto-generated method stub
		//try {
		System.out.println("Hello World!");
		int i = 1/0;
		System.out.println("Test is completed");
		/*} catch (Exception e) {
			// TODO: handle exception
			System.out.println("I am inside catch bloc");
			System.out.println("Message is "+ e.getMessage());
			System.out.println("Cause is " + e.getMessage());
		}

		finally {

			System.out.println("I am finally block");
		}
		 */
	}
}


