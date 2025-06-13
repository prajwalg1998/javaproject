package User_input;

import java.util.Scanner;

public class $3_Scanner_class {

	public static void main(String[] args) {

		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter your age");
		int age=scanner.nextInt();
		String canIvote= age>= 18?"Yes":"No";
		System.out.println(canIvote);
	}

}
