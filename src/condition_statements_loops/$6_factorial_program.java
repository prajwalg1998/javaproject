package condition_statements_loops;

import java.util.Scanner;

public class $6_factorial_program {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		if(!scanner.hasNextInt())
		{
			System.out.println("Enter the values in integer");
			return;
		}
		int num=scanner.nextInt();
		int factorial=1;
		if(num<0)
		{
			System.out.println("Negative factorial not allowed");
			return;
		}
		if(num<=0)
		{
			System.out.println(factorial);
		}
		else
		{
			for(int i=1;i<=num;i++)
			{
				factorial=factorial*i;
			}
		}
		System.out.println(factorial);

	}

}
