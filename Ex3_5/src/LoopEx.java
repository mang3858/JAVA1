import java.util.*;
public class LoopEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		int i;
		
		System.out.print("출력하고 싶은 구구단을 입력하시오: ");
		num = sc.nextInt();
		
		i = 1;
		while(i <= 9) {
			System.out.println(num+"*"+i+" = "+num*i);
			i++;
		}
	}

}
