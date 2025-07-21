package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class task7 {

	public static void main(String[] args) {
		try{
			FileReader f1=new FileReader("Cinetpub.txt");
		}catch(FileNotFoundException e) {
			System.out.println("Not able to find the file");
		}
		
		

	}

}
