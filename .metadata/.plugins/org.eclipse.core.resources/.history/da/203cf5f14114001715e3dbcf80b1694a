package tw.leonchen.my.project.Exception;

class MyOwnExceptionError extends Exception {
	private String serve ="skyblue";
	private int port =1000;
	private String errMsg ="error";
	
	MyOwnExceptionError(String sever,int port,String errMsg){
		this.serve = serve;
		this.port = port;
		this.errMsg = errMsg; 
	}
	
	public void showInfo(){
		System.out.println("serve:" + serve);
		System.out.println("port:" + port);
		System.out.println("errMsg:" + errMsg);
	}
}
public class MyOwnException{
	
	public static void main(String[] args) {
		int code = 1006;
		
		if(code%2==0){
			try{
				throw new MyOwnExceptionError("red",200,"hacked");
			}catch(MyOwnExceptionError e){
				//e.printStackTrace();
				e.showInfo();
				
			}
		}
	}

}
