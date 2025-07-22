package Lists;

import java.util.ArrayList;

public class task1 {

	public static void main(String[] args) {
		ArrayList student_name=new ArrayList();
		student_name.add("Dipak");
		student_name.add("Ravi");
		student_name.add("Sneha");
		student_name.add("Priya");
		student_name.add("Anjali");
		for(int i=0;i<student_name.size();i++) {
			System.out.println(student_name.get(i));	
		}
		
	}

}
