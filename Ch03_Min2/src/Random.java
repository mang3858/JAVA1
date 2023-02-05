
public class Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr1 = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] arr2 = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		
		for (int i = 0; i < 5; i++) {
			int shape = (int)(Math.random() * 4);
			int num = (int)(Math.random() * 13);
			System.out.printf("%s의 %s\n", arr1[shape], arr2[num]);
		}
	}

}
