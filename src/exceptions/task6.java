package exceptions;

public class task6 {

	public static void main(String[] args) {
		String s=null;
		try{
			s.split(s);
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
