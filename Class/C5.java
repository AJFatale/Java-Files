package Class;
class X1{
	int i,j;
	X1(){
		i=10;
		j=20;
	}
	X1(int x,int y)
	{
		i=x;
		j=y;
	}
	void add() {
		System.out.println(i+j);
	}
}
public class C5 {

	public static void main(String[] args) {
		X1 t1=new X1();
		t1.add();
		X1 t2=new X1(20,38);
		t2.add();
		// TODO Auto-generated constructor stub
	}

}
