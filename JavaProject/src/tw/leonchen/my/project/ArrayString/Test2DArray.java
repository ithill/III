package tw.leonchen.my.project.ArrayString;

public class Test2DArray {

	public static void main(String[] args) {
		int[][] data = {{1,2,3},{4,5,6,7}};
		
		for(int i=0; i<data.length; i++){
			for(int j=0; j<data[i].length; j++){
				System.out.println("data[" + i +"]"+"[" + j +"]=" +data[i][j]);
			}
		}
	}

}
//data.length=how many arrays?
//data[].length=