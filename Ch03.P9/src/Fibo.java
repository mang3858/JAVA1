import java.util.*;
public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		int a = 0;
		int b = 1;
		int c;
		
		System.out.print("출력할 항의 개수: ");
		num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			System.out.printf("%d ", a);
			c = a+b;
			a = b;
			b = c;
		}
	}

}
