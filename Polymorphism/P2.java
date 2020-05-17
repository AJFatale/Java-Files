package Polymorphism;
class C{
	void show() {
		System.out.println("in C");
	}
}
class B extends C{
	void show() {
		System.out.println("In B");
	}
}
public class P2 {

	public static void main(String[] args){
		B t=new B();
		t.show();
		// TODO Auto-generated constructor stub
	}

}
