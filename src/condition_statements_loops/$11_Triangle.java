package condition_statements_loops;

import java.util.Scanner;

public class $11_Triangle {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the side a");
        int a=scanner.nextInt();
        System.out.println("Enter the side b");
        int b=scanner.nextInt();
        System.out.println("Enter the side c");
        int c=scanner.nextInt();
        if(a==b && a==c)
        {
            System.out.println("Equilateral");
        }
        else if(a==b || b==c ||a==c)
        {
            System.out.println("Isosceles");
        }
        else
        {
            System.out.println("Scalene");
        }

	}

}
