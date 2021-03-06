package tw.ithill.practice;

class Person{
	private String name;
	private String location;
	
	Person(String name){
		this.name = name;
		location = "Taipei";
	}
	
	Person(String name,String location){
		this.name = name;
		this.location = location;
	}
	
	public String info(){
		return "name" + name + "location" +location;
	}
}

class Student extends Person{
	private String school;
	
	Student(String name,String school){
		this(name,"Taipei",school);
	}
	
	Student(String n,String l,String school){
		super(n,"1");
		this.school = school;
	}
	
	public String info(){
		return super.info() + "school:" + school;
	}
}

public class TestStudent {

	public static void main(String[] args) {
		Person p1 = new Person("A");
		Person p2 = new Person("B","Tokyo");
		
		Student s1 = new Student("C","l1");
		
	}

}
