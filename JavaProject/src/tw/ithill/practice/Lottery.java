package tw.ithill.practice;

public class Lottery {
	int[][] arr = new int[42][2];

	public void assignvalue(){
		int number = 0;
		
		for(int i=0; i<arr.length; i++){
			arr[i][0] = i+1;
		}
		 for(int i=0; i<100000; i++){
			 number = (int)(Math.random()*42)+1;
			 
			 arr[number-1][1] = arr[number-1][1]+1;
		 }
	}
	
	public void sort(){
		int temp,temp1;
		for(int i=0; i<arr.length-1; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i][1]<arr[j][1]){
				temp = arr[i][0];
				temp1 = arr[j][1];
				arr[i][0] = arr[j][0];
				arr[j][1] = arr[i][1];
				arr[j][0]= temp;
				arr[i][1]= temp1;
				}
			}
		}
	}
	
	public void print(){
		for(int i=0; i<arr.length; i++){
			if(arr[i][0]<10){
				System.out.println(arr[i][0]+" "+":" +arr[i][1]);
			}else
				System.out.println(arr[i][0]+ ":" +arr[i][1]);
				
		}
	}
	public static void main(String[] args) {
		Lottery l = new Lottery();
		l.assignvalue();
		l.sort();
		l.print();
	}

}
