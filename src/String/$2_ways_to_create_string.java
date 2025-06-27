package String;

public class $2_ways_to_create_string {

	public static void main(String[] args) {
		String s="Prajwal";
		System.out.println(s);// direct assigning with String data type and stored in String constant pool
		
		String s1=new String("PRAJWAL");//create with help of new operator and stored in object area
		System.out.println(s1);

	}

}
