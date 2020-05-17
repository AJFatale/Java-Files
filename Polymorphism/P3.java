package Polymorphism;
class A1{
public String toString() {
	return "Object of A class";
	}
}
class A2 extends A1{
	public String toString() {
		return "Object of B class";
		
	}
}
public class P3 {

	public static void main(String[] args) {
		A2 t1=new A2();
		System.out.println(t1);
		System.out.println(t1.toString());
	}

}
