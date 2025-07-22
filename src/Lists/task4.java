package Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add("Mumbai");
		a.add("Delhi");
		a.add("Pune");
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the city name");
		String city=scanner.next();
		if(a.contains(city)) {
			System.out.println("Pune city is in the list");
		}
		else {
			System.out.println("Not there in the list");
		}
	}

}
