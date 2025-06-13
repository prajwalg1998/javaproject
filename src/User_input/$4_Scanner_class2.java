package User_input;

import java.util.Scanner;

public class $4_Scanner_class2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Minimum age to consume alcohol");
        int age=scanner.nextInt();
        String Canihave= age>=18?"yes":"no";
        System.out.println(Canihave);
        
	}

}
