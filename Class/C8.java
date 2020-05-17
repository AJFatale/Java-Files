package Class;
class Xy{
	int i;
	static int j;
	Xy(){
		++i;
		j++;
	}
	static void display() {
		System.out.println("Hello World");
	}
	void show() {
		System.out.println(i);
		System.out.println(j);
		display();
	}
}
public class C8{

	public static void main(String[] args){
		Xy t1=new Xy();
		t1.show();
	
		// TODO Auto-generated constructor stub

	}}
