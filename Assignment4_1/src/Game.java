import java.util.*;
public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int user;
		int cnt = 0;
		int i = (int)(Math.random() * 100);
		
		do {
			System.out.print("정답을 추측하여 보세요: ");
			user = sc.nextInt();
			cnt++;
			if (i < user)
				System.out.println("LOW");
			if (i > user)
				System.out.println("HIGH");
		} while(i != user);
		System.out.println("축하합니다. 시도횟수 = " + cnt);
	}

}
