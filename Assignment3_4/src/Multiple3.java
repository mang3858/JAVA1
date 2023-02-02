import java.util.*;
public class Multiple3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		int sum = 0;
		int i, j;
		
		System.out.print("구하려는 범위의 숫자를 입력하세요: ");
		num = sc.nextInt();
		
		i = 0;
		j = 0;
		while (i <= num) {
			if (i % 3 == 0) {
				System.out.print(i+"\t");
				sum += i;
				j++;
				if (j % 5 == 0)
					System.out.print("\n");
			}
			i++;
		}
		System.out.printf("\n0부터 %d까지의 3의 베수의 합: %d", num, sum);	
	}

}
