package Switch;

public class $5_multiple_conditions {

	public static void main(String[] args) {
		int b=10;
		switch(b)
		{
		case 1,2,3,4,5:
		System.out.println("first 5 digits");
		break;
		case 6,7,8,9,10:
			System.out.println("next 5 digits");
		break;
			default:
				System.out.println("no idea");
				break;
		}

	}

}
