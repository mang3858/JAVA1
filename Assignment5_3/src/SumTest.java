import java.util.*;
public class SumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Sum s = new Sum();
		int n1, n2;
				
		System.out.print("정수를 입력하세요: ");
		n1 = sc.nextInt();
		System.out.print("정수를 입력하세요: ");
		n2 = sc.nextInt();
		s.sum(n1, n2);
	}

}
