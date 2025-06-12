package Type_casting;

public class $1_Widening_casting {

	public static void main(String[] args) {
		byte b=10;
		int a=b;
		System.out.println(b); //Implicit widening
		
		byte c=10;
		int d=(int)c;
		System.out.println(b); //Explicit widening
		
	}

}
