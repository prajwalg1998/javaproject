package Inheritance_multilevel_inheritance;

public class Runner {

	public static void main(String[] args) {
		/*son s1= new son();
		s1.goldGF();
		s1.home();
		s1.f();
		F s2=new F();
		s2.goldGF();
		s2.home();
		GF s3=new son();
		s3.goldGF();
		s3.home();
		GF s4=new F();
		s4.home();*/
		F s5=new son();
		s5.goldGF();
		s5.f();
		s5.goldF();
		s5.home();

	}

}
