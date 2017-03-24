package tw.ithill.practice;
public class TestSetName {

	public static void main(String[] args) {
		Name n = new Name("Justin");
		Name n1 = new Name("Justin"); 
		n.setName("John");
		n1.nonSetName();
		System.out.println(n.name);
		System.out.println(n1.name);

	}
}
class Name{
	String name;
	Name(String name){
		this.name = name;
	}
	void setName(String s){
		name = s;
	}
	void nonSetName(){
		 Name s = new Name("Bill");
	}
}
