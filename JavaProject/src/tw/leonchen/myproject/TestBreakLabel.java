package tw.leonchen.myproject;

public class TestBreakLabel {

	public static void main(String[] args) {
		hero:
		for(int i=1; i<=3; i++){
			for(int j=1; j<=4;j++){
				if(i==2 && j==3)
					continue hero;
					//break hero;
			System.out.println("i=" + i +"  "+"j=" + j);
			}			
		}
	}

}
