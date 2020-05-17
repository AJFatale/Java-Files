package Inheritance;
class x1{
	int x,y;
	void set(int x,int y) {
		this.x=x;
		this.y=y;
	}
	void add() {
		System.out.println(x+y);
	}
}
class X2 extends x1{
	void sub() {
		System.out.println(x-y);
	}
}
public class A1 {

	public static void main(String[] args) {
		X2 t=new X2();
		t.set(30, 20);
		t.add();
		t.sub();
		
		// TODO Auto-generated constructor stub
	}

}
