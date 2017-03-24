package tw.leonchen.my.project.oop;

public class AnonymousCon {

		AnonymousCon(int number){
			System.out.println("execute here" + number);
		}
		public static void main(String[] args) {
			AnonymousCon t = new AnonymousCon(6);
			new AnonymousCon(6).Print();
			System.out.println("Understand?");
		}	
		void Print(){
			System.out.println("print here");
		}


}
