package Polymorphism;
class B1{
	void read() {
		System.out.println("Read from key");
	}
}
class B2 extends B1{
	void read() {
		System.out.println("Read from hdd");
	}
}
class B3 extends B2{
	void read() {
		System.out.println("Read from file");
	}
}

public class P4 {

	public static void main(String[] args){
		B1 t1=new B1();
		B2 t2=new B2();
		B3 t3=new B3();
		show(t1);
		show(t2);
		show(t3);
		
		// TODO Auto-generated constructor stub
	}
	static void show(B1 r) {
		r.read();
	}

}
