import java.util.*;
public class Weight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int h, w;
		double kg;
		
		System.out.print("키를 입력하세요: ");
		h = sc.nextInt();
		System.out.print("몸무게를 입력하세요: ");
		w = sc.nextInt();
	
		kg = (h - 100) * 0.9;
		
		if(w > kg) 
			System.out.println("과체중 입니다.");
		else if(w < kg) 
			System.out.println("저체중 입니다.");
		else 
			System.out.println("표준체중 입니다.");
	}

}
