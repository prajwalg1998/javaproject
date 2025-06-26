package condition_statements_loops;

import java.util.Scanner;

public class $15_max_of_two_num {

	    public static void main(String[] args) {
	    	Scanner scanner=new Scanner(System.in);
	        System.out.println("Enter the a");
	        int n=scanner.nextInt();
	        System.out.println("Enter the b");
	        int n1=scanner.nextInt();
	        if(n>n1)
	        {
	            System.out.println("a is max");
	        }
	        else if(n1>n)
	        {
	            System.out.println("b is max");
	        }
	        else
	        {
	            System.out.println("Enter 2 different num");
	        }
	    }
}

