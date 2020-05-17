package Class;
class Student{
	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
		
	}
}

public class C9 {

	public static void main(String[] args){
		Student t=new Student();
		t.setId(100);
		t.setName("Abhi");
		System.out.println(t.getId());
		System.out.print(t.getName());
		// TODO Auto-generated constructor stub
	}

}
