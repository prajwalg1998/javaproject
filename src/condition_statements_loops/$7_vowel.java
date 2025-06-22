package condition_statements_loops;

import java.util.Scanner;

public class $7_vowel {
	public static void main(String[] args)
	{
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the word");
		char ch=scanner.next().toLowerCase().charAt(0);
		if(ch=='a' || ch=='e' || ch=='i' ||ch=='o' || ch=='u')
		{
			System.out.println(ch +" is vowel");
		}
		else if(ch>='a' && ch<='z')
		{
			System.out.println(ch +" is consonent");
		}
		else
		{
			System.out.println("Invalid character");
		}
		
	}

}
