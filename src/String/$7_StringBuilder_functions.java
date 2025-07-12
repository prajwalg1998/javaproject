package String;

public class $7_StringBuilder_functions {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Prajwal");
		sb.append(123);
		System.out.println(sb)
		;
		StringBuilder sb1=new StringBuilder("Prajwal");
		sb1.reverse();
		System.out.println(sb1);
		StringBuilder sb2=new StringBuilder("Prajwal");
		sb2.deleteCharAt(4);
		System.out.println(sb2);
		StringBuilder sb3=new StringBuilder("Prajwal");
		sb3.replace(0, 6, "Yogesh");
		System.out.println(sb3);

	}

}
