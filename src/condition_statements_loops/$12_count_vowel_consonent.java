package condition_statements_loops;

import java.util.Scanner;

public class $12_count_vowel_consonent {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any string");
        String name = scanner.next().toLowerCase();
        int vowelCount = 0, consonantCount = 0;
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            } else {
                consonantCount++;
            }
        }
        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonant: " + consonantCount);

	}

}
