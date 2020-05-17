package Class;
class C{
	int i;
	C(){
		i++;
	}
	void show() {
		System.out.println(i);
	}
}
public class C6 {

	public static void main(String[] args){
		C t1=new C();
		C t2=new C();
		C t3=new C();
		t1.show();
		t2.show();
		t3.show();
		// TODO Auto-generated constructor stub
	}

}
