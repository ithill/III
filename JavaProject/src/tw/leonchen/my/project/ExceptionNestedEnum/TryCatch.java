package tw.leonchen.my.project.ExceptionNestedEnum;

public  class TryCatch {
	int[] arr = {1,2,3,4,5};

	public void processAction(){
		
		try{
			for(int i=0; i<=5; i++){
				System.out.println("arr["+ i +"]=" +arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
			System.exit(-1);
		}catch(ArithmeticException e){
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("ya");
		}
	}	
		
	public static void main(String[] args) {
		TryCatch t = new TryCatch();
		t.processAction();
	}

}
