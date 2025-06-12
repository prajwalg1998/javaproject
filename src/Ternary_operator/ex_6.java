package Ternary_operator;

public class ex_6 {

	public static void main(String[] args) {

		int a1=50;
		int a2=65;
		int a3=-60;
		
		int res=(a1<a2) ? (a1<a3)?a1:a3 : (a2<a3)?a2:a3;
		System.out.println(res);
				
						
	}

}
