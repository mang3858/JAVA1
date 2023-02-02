import java.util.*;
public class BIggerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3;
		int max;
		
		System.out.print("첫번째 숫자를 입력하세요: ");
		num1 = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요: ");
		num2 = sc.nextInt();
		System.out.print("세번째 숫자를 입력하세요: ");
		num3 = sc.nextInt();
		
		if (num1 >= num2 && num1 >= num3)
			max = num1;
		else if (num2 >= num1 && num2 >= num3)
			max = num2;
		else
			max = num3;
		
		System.out.println("가장 큰 숫자는 " + max + "입니다.");
	}

}
