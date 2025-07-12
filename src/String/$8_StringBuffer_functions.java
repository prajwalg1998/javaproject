package String;

public class $8_StringBuffer_functions {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Prajwal");
		sb.append(123);
		System.out.println(sb)
		;
		StringBuffer sb1=new StringBuffer("Prajwal");
		sb1.reverse();
		System.out.println(sb1);
		StringBuffer sb2=new StringBuffer("Prajwal");
		sb2.delete(0, 2);
		System.out.println(sb2);
		StringBuffer sb3=new StringBuffer("Prajwal");
		sb3.replace(1, 6, "Yogesh");
		System.out.println(sb3);

	}

}
