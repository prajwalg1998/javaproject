package exceptions;

public class ex1 {

	public static void main(String[] args) {
		System.out.println("1");
		/*int b=100/0; java.lang.ArithmeticException
		System.out.println(b);*/
		try {
			int a=100/0;
		}catch(ArithmeticException e) {
			System.out.println("Zero cannot be divisor");
		}
		System.out.println("2");

	}

}
