import java.util.*;
public class RockPaperScissorsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a;
		String b;
		
		System.out.println("가위 바위 보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
		System.out.print("User A >> ");
		a = sc.next();
		System.out.print("User B >> ");
		b = sc.next();
		
		if (a.equals("가위") && b.equals("가위"))
		{
			System.out.println("비겼습니다");
		}
		else if (a.equals("바위") && b.equals("바위"))
		{
			System.out.println("비겼습니다");
		}
		else if (a.equals("보") && b.equals("보"))
		{
			System.out.println("비겼습니다");
		}
		else if (a.equals("가위") && b.equals("바위"))
		{
			System.out.println("B가 이겼습니다");
		}
		else if (a.equals("가위") && b.equals("보"))
		{
			System.out.println("A가 이겼습니다");
		}
		else if (a.equals("바위") && b.equals("가위"))
		{
			System.out.println("A가 이겼습니다");
		}
		else if (a.equals("바위") && b.equals("보"))
		{
			System.out.println("B가 이겼습니다");
		}
		else if (a.equals("보") && b.equals("가위"))
		{
			System.out.println("B가 이겼습니다");
		}
		else if (a.equals("보") && b.equals("바위"))
		{
			System.out.println("A가 이겼습니다");
		}
	}

}
