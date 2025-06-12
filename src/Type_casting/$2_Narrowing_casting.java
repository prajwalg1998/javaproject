package Type_casting;

public class $2_Narrowing_casting {
	
	public static void main(String [] args)
	{
		int a=1000;
		byte b=(byte)a;
		System.out.println(b); // explicit narrowing
		
		int a1=100;
		float f=18.89f;
		int b1=(int) (a1+f);
		System.out.println(b1); //wrong data type used for conversion
		
		int a2=100;
		float f1=18.89f;
		float b2=(float) (a2+f1);
		System.out.println(b2); //correct data type used
	}

}
