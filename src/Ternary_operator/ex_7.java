package Ternary_operator;

public class ex_7 {

	public static void main(String[] args) {

		int age1=18;
		int age2=45;
		int age3=65;
		
		int res=(age1>age2)?(age1>age3)?age1:age3:(age2>age3)?age2:age3;
		System.out.println(res);

						
	}

}
