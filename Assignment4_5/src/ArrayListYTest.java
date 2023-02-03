import java.util.*;
public class ArrayListYTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Double> list = new ArrayList<>();
		double max;
		double sum = 0;
		list.add(1.0);
		list.add(2.0);
		list.add(3.0);
		list.add(4.0);
		
		for (Double obj:list)
			System.out.print(obj+" ");
		
		max = 1.0;
		for (int i = 0; i < 4; i++) {
			sum += list.get(i);
			if (list.get(i) > max)
				max = list.get(i);
		}
		
		System.out.println("\n합은 " + sum);
		System.out.println("최대값은 "+ max);
	}

}
