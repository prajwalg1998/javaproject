package Switch;

import java.util.Scanner;

public class $6_vowels {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the char");
		char ch=scanner.next().toLowerCase().charAt(0);
		switch(ch) {
		case 'a','e','i','o','u':
		System.out.println(ch +" is vowel");
		break;
		
		default:
		System.out.println(ch +" is consonent");
		}

	}

}
