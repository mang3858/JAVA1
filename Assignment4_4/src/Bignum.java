import java.util.*;
public class Bignum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] num = {1.0, 2.0, 3.0, 4.0};
		double max = num[0];
		double sum = 0;
		
		System.out.print("toString()으로 출력: ");
		System.out.println(Arrays.toString(num));
		
		for(double v : num) {
			System.out.print(v + " ");
			sum += v;
			if (v > max)
				max = v;
		}
		
		System.out.println("\n합은 " + sum);
		System.out.println("최대값은 "+ max);
	}

}
