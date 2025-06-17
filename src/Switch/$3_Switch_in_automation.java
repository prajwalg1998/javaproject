package Switch;

import java.util.Scanner;

public class $3_Switch_in_automation {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the browser name");
		String browser=scanner.next();
		browser= browser.toLowerCase();
		switch(browser)
		{
		case("chrome"):
			System.out.println("Starting chrome");
		    System.out.println("executing tc1");
		    System.out.println("executing tc2");
		    break;
		case("edge"):
			System.out.println("Starting edge");
	    System.out.println("executing tc1");
	    System.out.println("executing tc2");
	    break;
		case("firefox"):
			System.out.println("Starting edge");
	    System.out.println("executing tc1");
	    System.out.println("executing tc2");
	    break;
	    default:
	    	System.out.println("I don't know this browser");
	    	
			
		}

	}

}
