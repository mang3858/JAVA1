import java.util.*;
public class AddressTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Address ad = new Address();
		String name, add;
		
		System.out.print("이름을 입력하세요: ");
		name = sc.nextLine();
		System.out.print("주소을 입력하세요: ");
		add = sc.nextLine();
		
		ad.add(name, add);
	}

}
