package tw.leonchen.my.project.ArrayString;

public class RandomArray {

	public static void main(String[] args) {
		int[] arr = new int[52];
		int count = 0;

		for (int i = 0; i < 52; i++) {
			int number = (int) (Math.random() * 52) + 1;
			if (arr[number - 1] == 0) {
				System.out.print(number + " ");
				arr[number - 1]=1;
				count++;
			}
			
			if (count == 4) {
				break;
			}
		}
	}
}
