import java.util.*;
public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		int binary;
		
		System.out.print("정수: ");
		num = sc.nextInt();
		
		while (num > 0) {
			binary = num % 2;
			num /= 2;
			System.out.print(binary);
		}
		
	}

}
