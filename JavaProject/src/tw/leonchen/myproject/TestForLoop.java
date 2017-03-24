package tw.leonchen.myproject;

public class TestForLoop {

	public static void main(String[] args) {
		/*for(int i=0; i<10; i++){
			for(int j=0; j<10; j++){
				System.out.print('@');
			}
			System.out.print('\n');
		}*/
		for(int i=1; i<10;i++){
			for(int j=1; j<10;j++){
				System.out.printf("%dx%d=%2d ",i,j,i*j);
		
			}
			System.out.println();
		}
	}

}
