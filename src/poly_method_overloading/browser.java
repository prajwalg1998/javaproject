package poly_method_overloading;

public class browser {

	public static void main(String[] args) {
		browser1 b1=new browser1();
	    b1.browser1();
	    b1.browser1("Chrome");

	}

}
class browser1 {
	void browser1(){
		System.out.println("Default browser");
	}
	String browser1(String browser1) {
		System.out.println("Starting broser "+ browser1);
		return browser1;
	}
}
