package exceptions;

public class task5 {
	 public static void main(String[] args)
	    {
	        int[] numbers = {10, 20, 30};
	        int result = 0;

	        try {
	            // Change these lines to test different exceptions:
	            result = numbers[5] / 0;  // May cause ArrayIndexOutOfBoundsException and ArithmeticException
	            System.out.println("Result: " + result);
	        } catch (Exception e)
	        {
	            System.out.println(e.getMessage());
	        }
	    }

}
