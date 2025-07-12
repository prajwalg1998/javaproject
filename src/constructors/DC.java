package constructors;

public class DC {

	public static void main(String[] args) {
		person p1=new person();
		//System.out.println(p1.name);
		//System.out.println(p1.job);
		//System.out.println(p1.age);

	}
}
class person{
	String name;
	int age;
	String job;
	person(){
		name="Prajwal G";
		age=26;
		job="Functional tester";
		System.out.println("DC");
	}
}
