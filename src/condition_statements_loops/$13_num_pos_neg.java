package condition_statements_loops;

import java.util.Scanner;

public class $13_num_pos_neg {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the integer");
        int i=scanner.nextInt();
        if(i>=0)
        {
            System.out.println("Positive integer");
        }
        else{
            System.out.println("Negative integer");
        }

	}

}
