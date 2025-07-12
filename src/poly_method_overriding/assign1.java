package poly_method_overriding;

public class assign1 {
	public static void main(String[] args) {
		animal a1=new animal();
		a1.sound();
		dog d1=new dog();
		d1.sound();
		cat c1= new cat();
		c1.sound();
		cow c2=new cow();
		c2.sound();
	}

}
class animal{
	void sound() {
		System.out.println("default sound");
	}
}
class dog extends animal{
	void sound() {
		System.out.println("bark");
	}
}
class cat extends animal{
	void sound() {
		System.out.println("meow");
	}
}
class cow extends animal{
	void sound() {
		System.out.println("moooo");
	}
}