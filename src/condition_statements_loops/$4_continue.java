package condition_statements_loops;

public class $4_continue {

	public static void main(String[] args)
	{
		for (int i=0;i<50;i++)
		{
			if(i%2==0)
			{
				continue;
			}
			System.out.println(i);
		}
	}
}
