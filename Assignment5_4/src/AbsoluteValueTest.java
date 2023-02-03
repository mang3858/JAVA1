import java.util.*;
public class AbsoluteValueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		AbsoluteValue obj = new AbsoluteValue();
		int num;
		
		System.out.print("정수를 입력하세요: ");
		num = sc.nextInt();
		System.out.printf("입력된 정수 %d의 절대값은 %d입니다.", num, obj.abs(num));
	}

}
