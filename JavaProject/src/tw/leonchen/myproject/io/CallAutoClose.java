package tw.leonchen.myproject.io;

public class CallAutoClose {

	public static void main(String[] args) {
		try{AutoClose test = new AutoClose();
			test.processRource();
		}catch(Exception e){
			e.printStackTrace();
		}	
	}

}
