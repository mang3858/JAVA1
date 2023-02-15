import java.util.*;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int year;
		int month;
		int day;
		
		System.out.print("태어난 년도를 입력하세요: ");
		year = sc.nextInt();
		System.out.print("태어난 월을 입력하세요: ");
		month = sc.nextInt();
		System.out.print("태어난 날짜를 입력하세요: ");
		day = sc.nextInt();
		
		Date d = new Date(year, month, day);
		d.print();
	}

}
