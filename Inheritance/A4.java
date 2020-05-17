package Inheritance;
class A111{
	int i;
	A111(){
		i=10;
	}
} class B111 extends A111{
	int i;
	B111(){
		i=20;
	}
	void add() {
		System.out.println(i+super.i);
	}
}
public class A4 {

	public static void main(String[] args){
		B111 t=new B111();
		t.add();
		// TODO Auto-generated constructor stub
	}

}
