package tw.leonchen.my.project.Equals;

class Car{
	private String brand = "Java";
	private int prize = 10000;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrize() {
		return prize;
	}
	public void setPrize(int prize) {
		this.prize = prize;
	}
	
	public void showInfo(){
		System.out.println("brand=" + brand);
		System.out.println("prize=" + prize);
	}
}
public class TestEquals {
	
	public static void main(String[] args) {
		
		Car mycar = new Car();
		mycar.setBrand("Android");
	}

}
