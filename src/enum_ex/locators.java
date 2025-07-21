package enum_ex;

public enum locators {
	page_input_email("#login-username"),
	page_input_password("#login-password"),
	page_button("#btn");
	
	private String locators;
	locators(String locators){
		this.locators=locators;
	}
	String getlocators() {
		return this.locators;
	}
	
}
