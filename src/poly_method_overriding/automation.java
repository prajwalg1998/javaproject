package poly_method_overriding;

public class automation {
	public static void main(String[] args) {
		common c1=new common();
		c1.openbrowser();
		chrome c2=new chrome();
		c2.openbrowser();
		firefox c3=new firefox();
		c3.openbrowser();
	}
}
class common{
	 void openbrowser(){
		System.out.println("Starting IE broswer");
	}
}
@override 
class chrome extends common{
	void openbrowser(){
		System.out.println("Starting Chrome browser");
	}
}
@override
class firefox extends common{
	void openbrowser(){
		System.out.println("Starting Firefox broser");
	}
}