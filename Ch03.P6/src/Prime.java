
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		int prime;
		
		System.out.print("2부터 100사이 모든 소수: ");
		for (i = 2; i <=100; i++) {
			prime = 1;
			for (j = 2; j < i; j++) {
				if (i % j == 0) {
					prime = 0;
					break;
				}
			}
			if (prime == 1)
				System.out.print(i+" ");
		}
	}

}
