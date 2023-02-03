import java.util.*;
public class Volume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double r;
		double v;
		
		System.out.print("구의 반지름: ");
		r = sc.nextDouble();
		v = r * r * r * 4 / 3;
		
		System.out.println("구의 부피: " + v);
	}

}
