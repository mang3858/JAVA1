import java.util.*;
public class RockPaperScissor {
	final int SCISSOR = 0;
	final int ROCK = 1;
	final int PAPER = 2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int user;
		int computer = (int)(Math.random() * 3);
		
		System.out.print("가위(0), 바위(1), 보(2): ");
		user = sc.nextInt();
		
		if (user == computer)
			System.out.println("비김");
		else if (user == (computer + 1) % 3)
			System.out.println("인간: "+user+"컴퓨터: "+computer+" 인간 승리");
		else
			System.out.println("인간: "+user+"컴퓨터: "+computer+" 컴퓨터 승리");
	}

}
