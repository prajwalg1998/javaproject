package Arrays;

public class $2_max_min_num {

	public static void main(String[] args) {
		int [] b= {10,20,30,11,56,77,7};
		int c=a(b);
		System.out.println(c);
		

	}
	static int a(int[] b)
	{
		int max =b[0];
		for(int i=0;i<b.length;i++) {
			if(b[i]>max)
			{
				max=b[i];
			}
		}
		return max;
			
	}

}
