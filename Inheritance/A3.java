package Inheritance;
class A11{
	int i;
	A11(){
		i=10;
		System.out.println("In A");
	}
}
class B11 extends A11{
	int j;
	B11(){
		j=20;
		System.out.println("In B");
	}
	void add() {
		System.out.println(i+j);
	}
}

public class A3 {

	public static void main(String[] args){
		B11 t=new B11();
		t.add();
		// TODO Auto-generated constructor stub
	}

}
