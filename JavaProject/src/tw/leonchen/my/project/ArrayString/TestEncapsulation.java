package tw.leonchen.my.project.ArrayString;

class Encapsulation{
	private String name = "Yet";
	private int age = 18;
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

public class TestEncapsulation {

	public static void main(String[] args) {
		Encapsulation e = new Encapsulation();
		e.setName("Ithill");
		e.getName();
		System.out.println(e.getName());
		
		e.setAge(25);
		e.getAge();
		System.out.println(e.getAge());
	}

}
