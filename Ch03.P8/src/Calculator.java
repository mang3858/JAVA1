import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double n1, n2;
		double result;
		String op;
		
		System.out.print("연산을 입력하세요: ");
		op = sc.nextLine();
		System.out.print("숫자 2개를 입력하세요: ");
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		
		if (op.equals("/")) {
			result = n1/n2;
			if (result < 0)
				System.out.println("연산을 수행할 수 없다");
			else
			System.out.println(n1 + "/" + n2 +" = " + (n1/n2));
		}
		else if (op.equals("+"))
			System.out.println(n1 + "+" + n2 +" = " + (n1+n2));
		else if (op.equals("-"))
			System.out.println(n1 + "-" + n2 +" = " + (n1-n2));
		else if (op.equals("*"))
			System.out.println(n1 + "*" + n2 +" = " + (n1*n2));
	}

}
