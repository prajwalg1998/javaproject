package poly_method_overloading;

public class calculator {

	public static void main(String[] args) {
		calc c1=new calc();
		c1.add(10, 20);
		c1.add(20, 50, 60);
		c1.sub(2.59, 1.59);
		c1.sub(0.0, 0.1, 0.2);
	}

}
class calc{
	int add(int a, int b) {
		System.out.println(a+b);
		return a+b;
	}
	int add(int a, int b, int c) {
		System.out.println(a+b+c);
		return a+b+c;
	}
	double sub(double d, double e) {
		System.out.println(d-e);
		return d-e;
	}
	double sub(double d, double e, double f) {
		System.out.println(d-e-f);
		return d-e-f;
	}
	
}
