package Type_casting;

public class assign_3 {

	public static void main(String[] args) {
		// Typecast a character to its ASCII integer value. Example Print A ASCII Int value. 
		
		char c1= 'A';
		int c2= c1;
		System.out.println(c2); //Widening
		
		char c3='Z';
		byte b=(byte)c3;
		System.out.println(b); //Narrowing
		

	}

}
