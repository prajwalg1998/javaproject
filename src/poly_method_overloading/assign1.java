package poly_method_overloading;

public class assign1 {
	public static void main(String[] args) {
		calc1 c1=new calc1();
		c1.add(20, 30);
		c1.add(22.5, 2.75);
	}

}
class calc1{
	    int add(int a, int b) {
		System.out.println(a+b);
		return a+b;
	}
	    double add(double a, double b) {
	    	System.out.println(a+b);
	    	return a+b;
	    }
	
}
