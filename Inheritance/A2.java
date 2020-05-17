package Inheritance;
class A{A(){
System.out.println("In A");	
	}}
class B extends A{
	B(){
		System.out.println("In B");
	}
	
}class C extends B{
	C(){
		System.out.println("In C");
	}
	void print() {
		System.out.println("Hence Inheritance");
	}
}
public class A2 {

	public static void main(String[] args){
		C t=new C();
		t.print();
		// TODO Auto-generated constructor stub
	}

}
