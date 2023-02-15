
public class Date {
	 int year;
	 int month;
	 int day;
	 
	 Date(int y, int m, int d) {
		 year = y;
		 month = m;
		 day = d;
	 }
	 void print() { 
		 System.out.printf("당신의 생일은 %d년%d월%d일 이네요!", year, month,day);
	 } 

}
