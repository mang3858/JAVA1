import java.util.*;
public class ChangesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int money;
		int price;

		System.out.print("받은 돈: ");
		money = sc.nextInt();
		System.out.print("상품 가격: ");
		price = sc.nextInt();
		
		System.out.println("부가세: "+(int)(price * 0.1));
		System.out.println("잔돈: "+(money - price));
	}

}
