package Inheritance;
class S{
	int i;
	S(){
		i=20;
		System.out.println("Constructure without args called");
	}
	S(int x){
		i=x;
		System.out.println("Constructure with args called");
	}
}
class T extends S{
	int i;
	T(){
		super(100);
		i=30;
		
	}
	void add() {
		System.out.println(i+super.i);
	}
}
public class A5 {

	public A5() {
		T t=new T();
			t.add();
		// TODO Auto-generated constructor stub
	}

}
