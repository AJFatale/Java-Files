package Abstract;
abstract class C1{
	void show() {
		System.out.println("In C1");
	}
	abstract void add(int x,int y);
}
class C2 extends C1{
	void add(int x,int y) {
		System.out.println(x+y);
	}
}
public class A1 {
	

	public static void main(String[] args){
		C2 t=new C2();
		t.add(13, 17);
		// TODO Auto-generated constructor stub
	}

}
