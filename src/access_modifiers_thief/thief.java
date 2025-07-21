package access_modifiers_thief;

import access_modifiers_cop.cop;

public class thief extends cop{
	public thief(int bullet) {
		super(bullet);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		cop t=new cop(100);
		t.canIshoot();
		t.gun=100;
	}

}
