package Class;
class T{
	int i,j;
	void setij(int x,int y) {
		i=x;
		j=y;
	}
	void add()
	{
		System.out.println(i+j);
	}
}
public class C2 {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		T t=new T();
		t.setij(10,11);
		t.add();
		}

}
