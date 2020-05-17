package Interface;
class Test implements A,B{
	public void add(int x,int y)
	{
		System.out.println(x+y);
	}
	public void sub(int x,int y)
	{
		System.out.println(x-y);
	}
	public void mul(int x,int y) {
		System.out.println(x*y);
	}
}
public class I1 {

	public static void main(String[] args){
		Test t1=new Test();
		t1.add(10, 26);
		t1.sub(15, 2);
		t1.mul(10, 2);
		// TODO Auto-generated constructor stub
	}

}
