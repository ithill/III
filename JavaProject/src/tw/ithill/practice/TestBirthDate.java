package tw.ithill.practice;
class BirthDate{
	private int day;
	private int month;
	private int year;
	
	BirthDate(int day,int month,int year){
		this.day = day;
		this.month = month;
		this.year = year;
		
	}
	public void setDay(int d){	
		day = d;
	}
	public void setMonth(int m){
		month = m;
	}
	public void setYear(int y){
		year = y;
	}
	public int getDay(int d){
		return d;
	}
	public int getMonth(int m){
		return m;
	}
	public int getYear(int y){
		return y;
	}
	public void print(){
		System.out.println(day + "-" + month + "-" +year );
	}
}
public class TestBirthDate {

	public static void main(String[] args) {
		BirthDate d1 = new BirthDate(1,1,2011);
		BirthDate d2 = new BirthDate(2,2,2022);
		d1.setDay(11);
		d1.setMonth(11);
		d1.setYear(2017);
		d1.print();
		d2.setYear(2016);
		d2.print();
		
		TestBirthDate t = new TestBirthDate();
		int date = 9;
		t.change1(date);
		t.change2(d1);
		t.change3(d2);
		System.out.println("date=" + date);
		d1.print();
		d2.print();
		
	}
	
	public void change1(int day){
		day =99; 
	}
	public void change2(BirthDate b){
		b = new BirthDate(5,5,2055);
	}
	public void change3(BirthDate b){
		b.setDay(7);
	}
}
