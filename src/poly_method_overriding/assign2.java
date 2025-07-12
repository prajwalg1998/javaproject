package poly_method_overriding;

public class assign2 {
	public static void main(String[] args) {
		vehicle v1= new vehicle();
		v1.start();
		bike b1= new bike();
		b1.start();
		car c1= new car();
		c1.start();
	}

}
class vehicle{
	void start() {
		System.out.println("Deafult start");
	}
}
class bike extends vehicle{
	void start() {
		System.out.println("Kick start the bike");
	}
}
class car extends vehicle{
	void start() {
		System.out.println("Turn the key to start the car");
	}
}
