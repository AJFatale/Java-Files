package Abstract;
abstract class Account{
	void getCustInfo() {
		System.out.println("Get Cust Info");
	}
	abstract void calculateInterest();
	
}
class Saving extends Account{
	void calculateInterest() {
		System.out.println("Calculate Interest of saving");
	}
}
class Current extends Account{
	void calculateInterest() {
		System.out.println("Calculate interest of current");
	}
}
public class A2 {

	public static void main(String[] args){
		Saving t1=new Saving();
		t1.getCustInfo();
		t1.calculateInterest();
		Current t2=new Current();
		t2.getCustInfo();
		
		t2.calculateInterest();
		// TODO Auto-generated constructor stub
	}

}
