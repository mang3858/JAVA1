import java.util.*;
public class Consonant_vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str;

		while (true) {
			System.out.print("문자를 입력하세요: ");
			str = sc.nextLine();

			if (str.equals("quit"))
				break;
			
			switch (str) {
			case "a": case "i": case "e": case "o": case "u":
			case "A": case "I": case "E": case "O": case "U":
				System.out.println("모음입니다");
				break;
			default:
				System.out.println("자음입니다");
				break;
			}
		}
		
		System.out.println("프로그램 종료!");

	}
}
