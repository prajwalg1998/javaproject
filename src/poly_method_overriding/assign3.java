package poly_method_overriding;

public class assign3 {
	public static void main(String[] args) {
		employee e1= new employee();
		e1.role();
		Manager m1=new Manager();
		m1.role();
		clerk c1=new clerk();
		c1.role();
		tester t1=new tester();
		t1.role();
	}

}
class employee{
	void role() {
		System.out.println("General Employee");
	}
}
@override
class Manager extends employee{
	void role() {
		System.out.println("Employee is a manager");
	}
}
@override
class clerk extends employee{
	void role() {
		System.out.println("Employee is a clerk");
	}
}
@override
class tester extends employee{
	void role() {
		System.out.println("Employee is a tester");
	}
}