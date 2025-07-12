package String;

import java.util.Scanner;
public class $6_palindrome {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the word");
		String input=scanner.next();
		String a=b(input);
		if(a.equalsIgnoreCase(input))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}

	}
	static String b(String input)
	{
		String reversed="";
		for(int i=input.length()-1; i >= 0;i--){
			reversed=reversed+input.charAt(i);
		}
		return reversed;
	}

}
