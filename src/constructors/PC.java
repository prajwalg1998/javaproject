package constructors;

public class PC {

	public static void main(String[] args) {
		person1 p1=new person1("Prajwal",26,"QA");
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.job);
		person1 p2=new person1("Pavan",27,"QA");
		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println(p2.job);

	}

}
class person1{
	 String name;
	 int age;
	 String job;
	 person1(String name,int age,String job){
		 this.name=name;
		 this.age=age;
		 this.job=job;
	 }
	
}
