package tw.ithill.practice;

public class PersonNoConstructor {
	int id;
	int age;
	
	void PersonNoConstructor(int _id,int _age){
		id = _id;
		age = _age;
	}
	public static void main(String[] args) {
		PersonNoConstructor no = new PersonNoConstructor();
		no.PersonNoConstructor(1,25);
		System.out.println(no.id);
		System.out.println(no.age);
	}

}
