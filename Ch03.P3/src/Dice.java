
public class Dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dice1[] = {1, 2, 3, 4, 5, 6};
		int dice2[] = {1, 2, 3, 4, 5, 6};
		int cnt = 0;

		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if(dice1[i]+dice2[j] == 6) {
					System.out.printf("(%d,%d), ",dice1[i], dice2[j]);
					cnt++;
				}
			}
		}
		System.out.printf("\n%d",cnt);
	}

}
