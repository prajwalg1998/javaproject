package condition_statements_loops;

import java.util.Scanner;

public class $10_Grade {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the grade");
        int grade=scanner.nextInt();
        if(grade<=100 && grade>=90)
        {
            System.out.println("You have scored grade A");
        }
        else if(grade<=89 && grade>=80)
        {
            System.out.println("You have scored grade B");
        }
        else if(grade<=79 && grade>=70)
        {
            System.out.println("You have scored grade C");
        }
        else if(grade<=69 && grade>=60)
        {
            System.out.println("You have scored grade D");
        }
        else if(grade<=59 && grade>=0)
        {
        	System.out.println("You have scored grade F");
        }
        else
        {
            System.out.println("Enter the value from 0-100");
        }

	}

}
