package exceptions;

public class task3 {
	public static void main(String[] args) {
		int a=10;
		try {
			int b=100/0;
			String s=args[10];
		}catch(ArithmeticException e ) {
			System.out.println("ArithmeticException occured");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException occured");
		}finally {
			System.out.println("Finally block executed");
		}

	}

}
