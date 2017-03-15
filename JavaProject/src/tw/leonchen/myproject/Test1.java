package tw.leonchen.myproject;

public class Test1 {

	public static void main(String[] args) {
		int i = 1;
		int j = i++;
		System.out.println("j=" + j);
		i = 1;
		j = ++i;
		System.out.println("j=" +j);

	}

}
