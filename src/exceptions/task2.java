package exceptions;

public class task2 {

	public static void main(String[] args) {
		int a=10;
		try {
			int b=100/0;
			String s=args[10];
		}catch(ArithmeticException e ) {
			System.out.println("ArithmeticException");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}

	}

}
