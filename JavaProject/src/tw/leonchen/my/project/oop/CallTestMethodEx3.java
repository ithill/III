package tw.leonchen.my.project.oop;
class Caculate{
	public int caculate(int x, int y){
		return x+y;
		//return x-y;
		//return x*y;
		//return x/y;
		//return x%y;
	}
}
public class CallTestMethodEx3 {

	public static void main(String[] args) {
		Caculate c = new Caculate();
		c.caculate(9,4);
		int result = c.caculate(9,4);
		System.out.println(result);
	}

}