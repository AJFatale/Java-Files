package Class;
class Test{
	Test(){}
	Test(int x,int y){
		System.out.println(x+y);
		
	}
	void show() {
		Test b=new Test();
	System.out.println("First class");	
	}
}
public class C1 {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		Test t=new Test(1,2);
		t.show();
	}

}
