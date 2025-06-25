package functions;

import java.util.Scanner;

public class $5_arithmetic_operation {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the num1");
		int a=0;
		if(scanner.hasNextInt())
		{
			 a=scanner.nextInt();
		}
		else {
			System.out.println("enter the int");
			 return;
		}
	
		System.out.println("Enter the num2");
		int b=0;
		if(scanner.hasNextInt())
		{
			 b=scanner.nextInt();
		}
		else {
			System.out.println("enter the int");
			 return;
		}
		
		int result1=sum(a,b);
		int result2=sub(a,b);
		int result3=mul(a,b);
		int result4=div(a,b);
		int result5=mod(a,b);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		

	}
	static int sum(int a,int b)
	{
		return (a+b);
	}
	static int sub(int a,int b)
	{
		return (a-b);
	}
	static int mul(int a,int b)
	{
		return (a*b);
	}
	static int div(int a,int b)
	{
		return (a/b);
	}
	static int mod(int a,int b)
	{
		return (a%b);
	}

}
