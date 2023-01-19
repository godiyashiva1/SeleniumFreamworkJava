package demo;

public class ExceptionHandlingDemo {

	public static void main(String[] args) throws Exception {
		
		try {
			demo();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		finally{
			System.out.println("Handled");
		}
	}
	
	public static void demo() throws Exception {
		
			System.out.println("Hello World");
			int a = 4/0;
			System.out.println("Selenium");
		
	}

}
