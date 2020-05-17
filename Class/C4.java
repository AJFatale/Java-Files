package Class;
class X{
	int i,j;
	
	X(){
		i=10;
		j=20;
		System.out.println("constructor without args called");
		
	}
	void add() {
		System.out.println(i+j);
	}
}
public class C4 {

	public static void main(String[] args){
		X t=new X();
		t.add();
		// TODO Auto-generated constructor stub
	}

}
