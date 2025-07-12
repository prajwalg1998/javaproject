package poly_method_overloading;

public class assign3 {
	public static void main(String[] args) {
		MathOperations m1=new MathOperations();
		int res=m1.multiply(5, 5);
		System.out.println(res);
		int res1=m1.multiply(5, 5, 5);
		System.out.println(res1);
	}

}
class MathOperations{
	int multiply(int a,int b) {
		//System.out.println(a*b);
		return a*b;
	}
	int multiply(int a, int b,int c) {
		//System.out.println(a*b*c);
		return a*b*c;
	}
}
