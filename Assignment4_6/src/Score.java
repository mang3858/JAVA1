import java.util.*;
public class Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		int sum = 0;
		double ave;
		
		System.out.print("성적을 입력받는 학생의 수는? ");
		num = sc.nextInt();
		int[] score = new int[num];
		
		for (int i = 0; i < score.length; i++) {
			System.out.print((i+1)+"번째 학생의 성적을 입력하세요:");
			score[i] = sc.nextInt();
			sum += score[i];
		}
		
		ave = sum / score.length;
		System.out.println("합계: "+sum);
		System.out.println("평균: "+ave);
		
	}

}
