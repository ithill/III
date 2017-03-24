package tw.leonchen.my.project.ArrayString;

import java.util.Arrays;

public class BubbleSort {
	int[] arr ={5,15,65,22,7};
	
	public  void numberSort(){
		
		for(int i=0; i<arr.length-1; i++){
			for(int j=i+1; j<arr.length; j++){
				
				if(arr[i]<arr[j]){
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}
	public void numberSort1(){
		Arrays.sort(arr);
	}
	
	public void numberSort2(){
		while(true){
			int count = 0; 
			for(int i=0; i<arr.length-1; i++){
				if(arr[i]<arr[i+1]){
					int temp = arr[i+1];
					arr[i+1] = arr[i];
					arr[i] = temp;
					count++;
				}
			}	
			if(count==0){
			break;
			}
		}
	}
	
	public void print(){
			
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		BubbleSort sort = new BubbleSort();
		sort.print();
		System.out.println("------------");
		//sort.numberSort();
		//sort.numberSort1();
		sort.numberSort2();
		sort.print();
		
	}

}
