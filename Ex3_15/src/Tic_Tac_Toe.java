import java.util.*;
public class Tic_Tac_Toe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char[][] board = new char[3][3];
		int x, y;
		int i, j;
		
		for (i = 0; i < 3; i++)
			for (j = 0; j < 3; j++)
				board[i][j] = ' ';
		
		do {
			for (i = 0; i < 3; i++) {
				System.out.println(" " + board[i][0] +"| "+ board[i][1] + "| " + board[i][2]);
				if (i !=2)
					System.out.println("---|---|---");
			}
			
			System.out.print("다음 수의 좌표를 입력하시오: ");
			x = sc.nextInt();
			y = sc.nextInt();
			
			if (board[x][y] != ' ') {
				System.out.println("잘못된 위치");
				continue;
			}
			else
				board[x][y] = 'X';
			
			for (i = 0; i < 3; i++) {
				for (j = 0; j < 3; j++)
					if (board[i][j] == ' ')
						break;
				if (board[i][j] == ' ')
					break;
			}
			if (i < 3 && j < 3)
				board[i][j] = 'O';
		}while (true);
	}

}
