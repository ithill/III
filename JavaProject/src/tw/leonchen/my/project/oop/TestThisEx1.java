package tw.leonchen.my.project.oop;

class Coordinate{
	int latitude,longitude;
	
	Coordinate(int latitude,int longitude){
		this.latitude = latitude;
		this.longitude = longitude; 
	}
	void print(){
		System.out.println("latitude=" + latitude);
		System.out.println("longitude=" + longitude);
	}
}
public class TestThisEx1 {
	
	public static void main(String[] args) {
		Coordinate coor = new Coordinate(20,125);
		coor.print();
	}

}
