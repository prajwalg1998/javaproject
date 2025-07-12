package poly_method_overloading;

public class assign2 {
	public static void main(String[] args) {
		printer p1=new printer();
		p1.printData("Prajju");
		p1.printData(26);
		p1.printData(25.25f);
	}

}
class printer{
	    String printData(String Data) {
		System.out.println(Data);
		return Data;
	}
	    int printData(int Data) {
		System.out.println(Data);
		return Data;
	}
	    float printData(float Data){
	    	System.out.println(Data);
	    	return Data;
	    }
}
