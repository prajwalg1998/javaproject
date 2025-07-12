package poly_method_overloading;

public class assign5 {
	public static void main(String[] args) {
		utility u1=new utility();
		int res=u1.max(50, 100);
		System.out.println(res +" is greater");
		int res2=u1.max(550, 200, 150);
		System.out.println(res2+" is greater");
		double res3=u1.max(2.05, 2.99);
		System.out.println(res3+" is greater");
	}

}
class utility{
	int max(int a, int b) {
		if(a>b) {
			//System.out.println(a+" a is greater");
			return a;
		}
		else {
			//System.out.println(b+" b is greater");
			return b;
		}
	}
	int max(int a, int b, int c) {
		if(a>b && a>c) {
			//System.out.println(a+" a is greater");
			return a;
		}
		else if(b>a && b>c) {
			//System.out.println(b+" b is greater");
			return b;
		}
		else {
			//System.out.println(c+" c is greater");
			return c;
		}
	}
	double max(double a,double b) {
		if(a>b) {
			//System.out.println(a+" a is greater");
			return a;
		}
		else {
			//System.out.println(b+" b is greater");
			return b;
		}
	}
}