package poly_method_overriding;

public class assign4 {
	public static void main(String[] args) {
		user u1=new user();
		u1.login();
		adminuser a1=new adminuser();
		a1.login();
		regularuser r1=new regularuser();
		r1.login();
	}

}
class user{
	void login() {
		System.out.println("user login");
	}
}
class adminuser{
	void login() {
		System.out.println("AdminUser login");
	}
}
class regularuser{
	void login() {
		System.out.println("RegularUser login");
	}
}