package tw.leonchen.my.project.oop;

class Shirt{
	int price = 2000;
	char size = 'L';
	
	//Shirt(int price,char size){
	//	this.price = price;
	//	this.size = size;
		
	//}
}
public class TestReference {

	public static void main(String[] args) {
		Shirt myshirt = new Shirt();
		Shirt yourshirt = new Shirt();
		
		myshirt.price = 3000;
		myshirt.size = 'M';
		
		yourshirt.price = 1500;
		yourshirt.size = 'S';
		
		System.out.println("myshirt.price=" + myshirt.price);
		System.out.println("myshirt.size=" +  myshirt.size);
		
		System.out.println("yourshirt.price=" + yourshirt.price);
		System.out.println("yourshirt.size=" +  yourshirt.size);
		
		System.out.println(myshirt);
		System.out.println(yourshirt);
		
		System.out.println("------------------------------");
		
		yourshirt = myshirt;
		System.out.println("yourshirt.price=" + yourshirt.price);
		System.out.println("yourshirt.size=" +  yourshirt.size);
		System.out.println(yourshirt);
		
		System.out.println("------------------------------");
		myshirt.price = 1000;
		myshirt.size = 'S';
		System.out.println("yourshirt.price=" + yourshirt.price);
		System.out.println("yourshirt.size=" +  yourshirt.size);
		System.out.println(yourshirt);
		
		
	
	}
	

}
