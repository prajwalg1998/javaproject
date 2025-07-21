package exceptions;

public class task9 {

	public static void main(String[] args) {
		try {
			int a=100/10;
			System.out.println(a);
		}catch(Exception e) {
			System.out.println("Catch block executed");
		}
		finally {
			System.out.println("Finally block executed");
		}
	}

}
