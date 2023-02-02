import java.util.*;
public class Box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double w;
		double h;
		double area;
		double perimeter;
		
		System.out.print("사각형의 가로를 입력하시오: ");
		w = sc.nextDouble();
		System.out.print("사각형의 세로를 입력하시오: ");
		h = sc.nextDouble();
		
		System.out.print("사각형의 넓이는 "+ w*h + "\n");
		System.out.print("사각형의 둘레는 "+2*(w+h));
	}

}
