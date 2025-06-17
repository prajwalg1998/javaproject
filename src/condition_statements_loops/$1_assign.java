package condition_statements_loops;

import java.util.Scanner;

public class $1_assign {

	public static void main(String[] args) {
	
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the side1");
		int side1=scanner.nextInt();
		System.out.println("Enter the side2");
		int side2=scanner.nextInt();
		System.out.println("Enter the side3");
		int side3=scanner.nextInt();
		
		if(side1==side2&&side1==side3)
		{
			System.out.println("equilateral");
		}
		else if(side1==side2 || side2==side3 ||side1==side3)
		{
			System.out.println("isosceles");
		}
		else
		{
			System.out.println("scalene");
		}
		

	}

}
