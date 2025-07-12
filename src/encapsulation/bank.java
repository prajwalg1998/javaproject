package encapsulation;

public class bank {

	public static void main(String[] args) {
		HDFC praj=new HDFC("Prajwal",1000);
		String name=praj.getname();
		System.out.println(name);
		praj.setbal(100000, true);
		long bal=praj.getbal();
		System.out.println(bal);
		praj.setname("Darshan");
		String name1=praj.getname();
		System.out.println(name1);

	}

}
class HDFC{
	private String name;
	private long bal;
	
	public HDFC(String name,long bal) {
		this.name=name;
		this.bal=bal;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	public long getbal() {
		return bal;
	}
	public void setbal(long bal,boolean iscashier ) {
		if(iscashier) {
			this.bal=bal;
		}
		else {
			System.out.println("Cannot change the bal");
		}
	}
}
