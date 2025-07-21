package exceptions;

public class task1 {

	public static void main(String[] args) {
		int a=10;
		try {
			int b=100/0;
		}catch(ArithmeticException e) {
			System.out.println("zero cannot be divided");
		}
	}

}
