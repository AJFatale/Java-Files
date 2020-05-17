package Class;
class CA{
	int i;
	static int j;
	CA(){
		++i;
		j++;
	}
	void show() {
		System.out.println(i);
		System.out.println(j);
	}
}
public class C7 {

	public static void main(String[] args){
		CA t1=new CA();
		CA t2=new CA();
		CA t3=new CA();
		t1.show();
		t2.show();
		t3.show();
		// TODO Auto-generated constructor stub

	}}
