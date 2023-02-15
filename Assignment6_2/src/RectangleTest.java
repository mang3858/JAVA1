import java.util.*;

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int width;
		int height;
		
		System.out.print("사각형의 가로를 입력: ");
		width = sc.nextInt();
		System.out.print("사각형의 세로를 입력: ");
		height = sc.nextInt();
		
		Rectangle r = new Rectangle(width, height);
		System.out.println("사각형의 넓이는 "+r.area()+"이다.");
	}

}
