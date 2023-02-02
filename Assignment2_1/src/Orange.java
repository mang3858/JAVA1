import java.util.*;
public class Orange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		int box;
		int remainder;
		
		System.out.print("오렌지의 개수를 입력사시오: ");
		num = sc.nextInt();
	
		box = num / 10;
		remainder = num % 10;
		System.out.print(box+"박스가 필요하고 "+remainder+"개가 남습니다.");
	}

}
