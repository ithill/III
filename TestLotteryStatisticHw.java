package tw.leonchen.myproject.oop.array;

public class TestLotteryStatisticHw {

	private int[] count = new int[42];
	private int[] number = new int[42];
	
	public void createRicherNumber() {
		for (int i = 1; i <= 100000; i++) {
			int rNum = (int) (Math.random() * 42) + 1;
			//System.out.println("rNum=" + rNum);			
			count[rNum-1]++;
		}
		
		for(int j=1;j<=number.length;j++){
			number[j-1]=j;
		}
	}
	
	
	public void numberSort1() {
		for (int i = 0; i < count.length - 1; i++) {
			for (int j = i + 1; j < count.length; j++) {

				int temp1 = 0, temp2 = 0;
				if (count[i] < count[j]) {
					temp1 = count[i];
					count[i] = count[j];
					count[j] = temp1;
					
					temp2 = number[i];
					number[i] = number[j];
					number[j] = temp2;
				}
			}
		}
	}
	
	
	public void printResult(){
		for(int k=0;k<count.length;k++){
			//System.out.print(number[k] + ":" + count[k] + "\t");
			System.out.printf("%2d:%4d\t", number[k] ,count[k]);
			
			if(((k+1)%6)==0){
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		TestLotteryStatisticHw richer = new TestLotteryStatisticHw();
		richer.createRicherNumber();
		System.out.println("Original Data:");
		System.out.println("------------------------------------------------");
		richer.printResult();
		System.out.println("------------------------------------------------");
		System.out.println("Sorted Data:");
		System.out.println("------------------------------------------------");
		richer.numberSort1();
		richer.printResult();
		System.out.println("------------------------------------------------");
	}

}
