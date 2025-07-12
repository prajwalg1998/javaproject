package poly_method_overloading;

public class assign4 {
	public static void main(String[] args)
	{
		Greeter g1=new Greeter();
		g1.greet();
		String name=g1.greet("Darshan");
		System.out.println(name);
	}

}
class Greeter{
	void greet() {
		System.out.println("hello");
	}
	String greet(String name) {
		System.out.println("hello "+name);
		return name;
	}
}
