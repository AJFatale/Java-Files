package Class;
class Demo{
	int i,j;
	void setij(int x,int y) {
		i=x;
		j=y;
	}
	void add()
	{
		System.out.println(i+j);
	}}
public class C3 {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		Demo t1=new Demo();
		t1.setij(10,20);
	 Demo t2;
	 t2=t1;
	 t2.setij(30,40);
	 t1.add();
	 t2.add();
	}

}
